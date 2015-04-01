package springIoC.task2.observer.xmlbaseinit.behavior;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import springIoC.task2.observer.xmlbased.model.OrderReceiver;
import springIoC.task2.observer.xmlbased.model.Taxi;

public class OrderPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;
	private List<Taxi> receivers = new ArrayList<Taxi>();

	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public List<Taxi> getReceivers() {
		return receivers;
	}

	public void setReceivers(List<Taxi> receivers) {
		this.receivers = receivers;
	}

	public void notifyAllReceivers() {
		for(Taxi receiver:receivers){
			applicationEventPublisher.publishEvent(new OrderReceiver(receiver));
		}
		
	}
}
