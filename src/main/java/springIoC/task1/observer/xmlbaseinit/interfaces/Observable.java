package springIoC.task1.observer.xmlbaseinit.interfaces;

public interface Observable {
	public void addObserver(Observer element);
	public void removeObserver(Observer element);
	public void notifyObservers();
}
