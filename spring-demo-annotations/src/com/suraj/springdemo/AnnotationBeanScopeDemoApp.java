package com.suraj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		
		FortuneService fortuneService = context.getBean("happyFortuneService",FortuneService.class);
		
		System.out.println(fortuneService.getDailyFortune());
		
		
		
		System.out.println("**********************@Bean****************************");
		
		
		Coach alphaCoach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(alphaCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyFortune());
		
		context.close();

	}

}
