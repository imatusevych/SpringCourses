package springIoC.task1.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springIoC.task1.observer.xmlbaseinit.client.Console;
import springIoC.task1.observer.xmlbaseinit.dataprovider.UserInfoProvider;
import springIoC.task1.observer.xmlbaseinit.interfaces.Observer;
import springIoC.task1.observer.xmlbaseinit.model.User;

public class Main_XML {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-app-config.xml");
		Console client = (Console) context.getBean("consoleClient");
		client.viewData();
		
		// HW
		// add observer ??
		// aware ??
		
		List<Observer> users = new ArrayList<Observer>(Arrays.asList(new User(
				"test", "test")));

		GenericBeanDefinition beanDefinitionDataProvider = new GenericBeanDefinition();
		beanDefinitionDataProvider.setBeanClass(UserInfoProvider.class);
		ConstructorArgumentValues constuctorArgs = new ConstructorArgumentValues();
		constuctorArgs.addGenericArgumentValue(users);
		beanDefinitionDataProvider.setConstructorArgumentValues(constuctorArgs);

		// inject dataProvider bean to Console ??
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context
				.getBeanFactory();
		beanFactory.registerBeanDefinition("userDataProvider",
				beanDefinitionDataProvider);

		Console client1 = (Console) context.getBean("consoleClient");
		client.viewData();
		
	}
}
