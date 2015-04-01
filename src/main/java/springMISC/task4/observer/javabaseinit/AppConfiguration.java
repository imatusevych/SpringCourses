package springMISC.task4.observer.javabaseinit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import springMISC.task4.observer.javabaseinit.client.Console;
import springMISC.task4.observer.javabaseinit.dataprovider.UserInfoProvider;
import springMISC.task4.observer.javabaseinit.interfaces.DataProvider;
import springMISC.task4.observer.javabaseinit.model.User;


@Configuration
@ComponentScan("springMISC.task4.observer.javabaseinit")
@PropertySource("classpath:app_test.properties")
public class AppConfiguration {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer load(){
		return new PropertySourcesPlaceholderConfigurer();
	}
		
	@Bean(name="user2")
	public User createUser2() {
		return new User("createUser2 for QA env", " createUser2 last name2");
	}
	
	@Bean(name="user1")
	public User createUser1() {
		return new User("createUser1 for QA env", " createUser1 last name1");
	}
	

	@Bean(name="userInfoProvider1")
	@Conditional(AppConditional.class)
	@Primary
	public DataProvider createUserInfoProvider(){
		return new UserInfoProvider();
	}
	
	@Bean(name="userInfoProvider2")
	public DataProvider createUserInfoProviderByDefault(){
		return new UserInfoProvider();
	}

	@Bean(name="console1")
	//@Qualifier("userInfoProvider1")
	public Console createClient(){
		return new Console();
	}

	
}
