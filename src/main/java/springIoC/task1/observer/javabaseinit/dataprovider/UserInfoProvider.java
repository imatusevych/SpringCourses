package springIoC.task1.observer.javabaseinit.dataprovider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import springIoC.task1.observer.javabaseinit.interfaces.Observable;
import springIoC.task1.observer.javabaseinit.interfaces.Observer;

public class UserInfoProvider implements Observable {
	@Autowired
	private List<Observer> elemets;

	public UserInfoProvider(List<Observer> elemets) {
		this.elemets = elemets;
	}

	public void addObserver(Observer element) {
		elemets.add(element);

	}

	public void removeObserver(Observer element) {
		elemets.remove(element);
	}

	public void notifyObservers() {
		for (Observer element : elemets) {
			element.printInfo();
		}

	}

	public List<Observer> getElemets() {
		return elemets;
	}

	public void setElemets(List<Observer> elemets) {
		this.elemets = elemets;
	}

	public UserInfoProvider() {

	}

}
