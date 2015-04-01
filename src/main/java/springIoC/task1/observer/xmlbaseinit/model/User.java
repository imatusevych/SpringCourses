package springIoC.task1.observer.xmlbaseinit.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import springIoC.task1.observer.xmlbaseinit.interfaces.Observer;

public class User implements Observer, BeanNameAware, BeanFactoryAware,
		ApplicationContextAware,BeanPostProcessor,DisposableBean, InitializingBean {

	private ApplicationContext appContext;
	private BeanFactory beanFactory;
	private String beanName;
	private String name;
	private String lastName;

	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public void printInfo() {
		System.out.println("User name:" + name + " last name:" + lastName);
	}

	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
		this.appContext = appContext;
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;

	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;

	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext(ApplicationContext appContext) {
		this.appContext = appContext;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public String getBeanName() {
		return beanName;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return bean;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("call destroy method");
		
	}

}
