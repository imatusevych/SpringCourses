package springIoC.task1.observer.javabaseinit.client;

import org.springframework.beans.factory.annotation.Autowired;

import springIoC.task1.observer.javabaseinit.interfaces.Observable;


public class Console {
	@Autowired
	private Observable dataProvider;

	public Console(Observable dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	public void viewData(){
		dataProvider.notifyObservers();
	}

	public Console() {
	}

	public Observable getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(Observable dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	
}
