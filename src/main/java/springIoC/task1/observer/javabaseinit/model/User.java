package springIoC.task1.observer.javabaseinit.model;

import springIoC.task1.observer.javabaseinit.interfaces.Observer;


public class User implements Observer {

	private String name;
	private String lastName;

	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public User() {
	}
	
	public void printInfo() {
		System.out.println("User name:" + name + " last name:" + lastName);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
