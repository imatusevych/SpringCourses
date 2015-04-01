package springIoC.task2.observer.xmlbased.model;

import org.springframework.context.ApplicationEvent;

public class OrderReceiver extends ApplicationEvent {

	public OrderReceiver(Taxi source) {
		super(source);
	}
	
    public Taxi getSource() {
        return (Taxi) super.getSource();
    }
	
}
