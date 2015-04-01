package springIoC.task1.observer.xmlbaseinit.client;

import springIoC.task1.observer.xmlbaseinit.interfaces.Observable;

public class Console{
	private Observable dataProvider;

	public Console(Observable dataProvider) {
		this.dataProvider = dataProvider;
	}

	public void viewData() {
		dataProvider.notifyObservers();
	}

}
