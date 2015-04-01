package springIoC.task1.observer.xmlbaseinit.dataprovider;

import java.util.List;

import springIoC.task1.observer.xmlbaseinit.interfaces.Observable;
import springIoC.task1.observer.xmlbaseinit.interfaces.Observer;

public class UserInfoProvider implements Observable {

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
		for(Observer element:elemets){
			element.printInfo();;
		}

	}

}
