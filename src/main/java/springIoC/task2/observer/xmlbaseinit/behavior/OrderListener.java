package springIoC.task2.observer.xmlbaseinit.behavior;

import org.springframework.context.ApplicationListener;

import springIoC.task2.observer.xmlbased.model.OrderReceiver;

public class OrderListener implements ApplicationListener<OrderReceiver> {

	public void onApplicationEvent(OrderReceiver event) {
		System.out.println("Message sended to taxi: "+event.getSource().getName());
	}

}
