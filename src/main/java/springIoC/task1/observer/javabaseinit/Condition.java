package springIoC.task1.observer.javabaseinit;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Condition implements ConfigurationCondition {

	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		return Boolean.valueOf(context.getEnvironment().getProperty("use.observer"));
	}

	public ConfigurationPhase getConfigurationPhase() {
		return ConfigurationPhase.REGISTER_BEAN;
	}

}
