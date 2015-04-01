package springMISC.task4.observer.javabaseinit.interfaces;

public interface DataProvider {
	public void addObserver(UserInfo element);
	public void removeObserver(UserInfo element);
	public void notifyObservers();
}
