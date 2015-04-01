package springMISC.task4.observer.javabaseinit.dataprovider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import springMISC.task4.observer.javabaseinit.interfaces.DataProvider;
import springMISC.task4.observer.javabaseinit.interfaces.UserInfo;

public class UserInfoProvider implements DataProvider {
	@Autowired
	private List<UserInfo> elemets;

	public UserInfoProvider() {
	}
	
	public UserInfoProvider(List<UserInfo> elemets) {
		this.elemets = elemets;
	}

	public void addObserver(UserInfo element) {
		elemets.add(element);

	}

	public void removeObserver(UserInfo element) {
		elemets.remove(element);
	}

	public void notifyObservers() {
		for (UserInfo element : elemets) {
			element.printInfo();
		}

	}

	public List<UserInfo> getElemets() {
		return elemets;
	}

	public void setElemets(List<UserInfo> elemets) {
		this.elemets = elemets;
	}


}
