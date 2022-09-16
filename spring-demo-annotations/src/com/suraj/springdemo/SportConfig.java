package com.suraj.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.suraj.springdemo")
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:fortuneList.properties")
public class SportConfig {
	
	@Value("${foo.good}")
	String fortuneValue;
	
	@Bean
	public FortuneService dullFortune() {
		return new DullFortune();
	}
	
	@Bean
	public Coach swimCoach() {
		System.out.println("INside the Swim Coach: "+fortuneValue);
		return new SwimCoach(dullFortune());
	}

}
