package com.fbm.store;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import lombok.*;

@Configuration
public class ConfigApplication {
	@Bean
	public ModelMapper modelMapper() {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(AccessLevel.PRIVATE);
		
		return mapper;
	}
}
