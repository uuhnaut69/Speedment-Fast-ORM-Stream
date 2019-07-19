package com.uuhnaut69.springspeedment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.company.sakila.SakilaApplication;
import com.company.sakila.SakilaApplicationBuilder;
import com.speedment.runtime.core.ApplicationBuilder;

@Configuration
public class Setup {
	@Bean
	public SakilaApplication createApplication() {
		return new SakilaApplicationBuilder().withPassword("root").withLogging(ApplicationBuilder.LogType.STREAM)
				.build();
	}

	@Bean
	public Jackson2ObjectMapperBuilder jacksonBuilder() {
		return new Jackson2ObjectMapperBuilder().indentOutput(true);
	}
}