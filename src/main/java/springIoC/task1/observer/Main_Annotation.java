package springIoC.task1.observer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springIoC.task1.observer.annotationbaseinit.client.Console;

public class Main_Annotation {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"annotaion-based-app-config.xml");
		
		Console userInfoProvider = context.getBean(Console.class);
		userInfoProvider.viewData();
		

	}
}
