package springIoC.task2.observer.xmlbased.model;


public class Taxi{
	private String name;

	public Taxi(String name) {
		super();
		this.name = name;
	}

	public Taxi() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
