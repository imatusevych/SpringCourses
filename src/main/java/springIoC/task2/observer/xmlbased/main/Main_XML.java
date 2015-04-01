package springIoC.task2.observer.xmlbased.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springIoC.task2.observer.xmlbaseinit.behavior.OrderPublisher;

public class Main_XML {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"task2-spring-app-config.xml");

		OrderPublisher orderPublisher = (OrderPublisher) context
				.getBean("orderPublisher");
		orderPublisher.notifyAllReceivers();

	}
}
