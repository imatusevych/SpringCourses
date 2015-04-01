package springIoC.task1.observer.javabaseinit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import springIoC.task1.observer.javabaseinit.client.Console;
import springIoC.task1.observer.javabaseinit.dataprovider.UserInfoProvider;
import springIoC.task1.observer.javabaseinit.interfaces.Observable;
import springIoC.task1.observer.javabaseinit.model.User;



@Configuration
@ComponentScan("springIoC.task1.observer.javabaseinit")
@PropertySource("classpath:app_test.properties")
public class AppConfiguration {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer load(){
		return new PropertySourcesPlaceholderConfigurer();
	}
		
	@Bean(name="user2")
	public User createUser4() {
		return new User("createUser2", " createUser2 last name2");
	}
	
	@Bean(name="user2")
	@Conditional(Condition.class)
	public User createUser3() {
		return new User("createUser2_c", " createUser2_c last name2");
	}
	
	@Bean(name="userInfoProvider1")
	public Observable createUserInfoProvider(){
		return new UserInfoProvider();
	}

	@Bean(name="console1")
	@Qualifier("userInfoProvider1")
	public Console createClient(){
		return new Console();
	}

	
}
