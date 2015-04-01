package springMISC.task4.observer.javabaseinit;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AppConditional implements ConfigurationCondition {

	public boolean matches(ConditionContext context,AnnotatedTypeMetadata metadata) {

		return Boolean.valueOf(context.getEnvironment().getProperty("use.config.observer"));
	}

	public ConfigurationPhase getConfigurationPhase() {
		return ConfigurationPhase.REGISTER_BEAN;
	}

}
