package springIoC.task1.observer.annotationbaseinit.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springIoC.task1.observer.annotationbaseinit.interfaces.Observable;

@Component
public class Console {
	@Autowired
	private Observable userInfoProvider;

	public Console() {
	}
	
	public Observable getDataProvider() {
		return userInfoProvider;
	}

	public void setDataProvider(Observable dataProvider) {
		this.userInfoProvider = dataProvider;
	}

	public void viewData(){
		userInfoProvider.notifyObservers();
	}
}
