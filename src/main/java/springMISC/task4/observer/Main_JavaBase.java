package springMISC.task4.observer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springMISC.task4.observer.javabaseinit.AppConfiguration;
import springMISC.task4.observer.javabaseinit.client.Console;


public class Main_JavaBase {

	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Console console = (Console) context.getBean("console1");
		console.viewData();
		
		System.out.println("Welcome to the world of Java");

	}
}
