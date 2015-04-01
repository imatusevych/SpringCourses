package springIoC.task1.observer.annotationbaseinit.model;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User implements springIoC.task1.observer.annotationbaseinit.interfaces.Observer {

	private String name;
	private String lastName;
	private UUID id;
	
	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		id = UUID.randomUUID();
	}

	public void printInfo() {
		System.out.println("User name:"+name+" last name:"+lastName + " id:" +id);
	}

	public User() {
		id = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}
	@Value("${user1name}")
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Value("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	

}
