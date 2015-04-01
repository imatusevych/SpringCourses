package springMISC.task4.observer.javabaseinit.client;

import org.springframework.beans.factory.annotation.Autowired;

import springMISC.task4.observer.javabaseinit.interfaces.DataProvider;


public class Console {
	@Autowired
	private DataProvider dataProvider;

	public Console(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	public void viewData(){
		dataProvider.notifyObservers();
	}

	public Console() {
	}

	public DataProvider getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	
}
