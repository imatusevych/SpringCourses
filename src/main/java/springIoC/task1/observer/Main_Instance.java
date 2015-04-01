package springIoC.task1.observer;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;

import springIoC.task1.observer.xmlbaseinit.model.User;

public class Main_Instance {

	public static void main(String args[]) {
		BeanFactoryLocator bf = ContextSingletonBeanFactoryLocator
				.getInstance();
		BeanFactoryReference bfr = bf.useBeanFactory("mainContext");

		User user = (User) bfr.getFactory().getBean("user1");
		
		// life cycle bean's
		System.out.println("app context contain bean user1:"
				+ user.getAppContext().containsBean("consoleClient"));
		System.out.println("bean qty:"
				+ user.getAppContext().getBeanDefinitionCount());
		System.out.println("bean name:" + user.getBeanName());
		System.out.println("bean isPrototype:"
				+ user.getBeanFactory().isPrototype("user1"));
		System.out.println("bean isSingleton:"
				+ user.getBeanFactory().isSingleton("user2"));

	}
}
