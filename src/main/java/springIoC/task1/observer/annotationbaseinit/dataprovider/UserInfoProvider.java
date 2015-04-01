package springIoC.task1.observer.annotationbaseinit.dataprovider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springIoC.task1.observer.annotationbaseinit.interfaces.Observer;

@Component
public class UserInfoProvider implements
		springIoC.task1.observer.annotationbaseinit.interfaces.Observable {
	@Autowired
	private List<Observer> observers;

	public UserInfoProvider() {
	}

	public List<Observer> getElemets() {
		return observers;
	}

	public void setElemets(List<Observer> observers) {
		this.observers = observers;
	}

	public void addObserver(
			springIoC.task1.observer.annotationbaseinit.interfaces.Observer element) {
		observers.add(element);

	}

	public void removeObserver(
			springIoC.task1.observer.annotationbaseinit.interfaces.Observer element) {
		observers.remove(element);

	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.printInfo();
		}

	}

}
