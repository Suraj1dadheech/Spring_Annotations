package com.suraj.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach1 = context.getBean("iceHockey",Coach.class);
		
		System.out.println(coach1.getDailyWorkout());
		
		System.out.println(coach.getDailyWorkout());
		
		
		System.out.println("*************************Autowiring***************************************");
		
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach2.getDailyWorkout());
		
		
		System.out.println("*************************Autowiring using fieid injection***************************************");
		
		
		System.out.println(coach1.getDailyFortune());
		
		
		System.out.println("*************Autowiring on different-different interfaces using @Qualifier*******************");
		Coach coach3 = context.getBean("baseBallCoach",Coach.class);
		
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach3.getDailyFortune());
		
		
		
		System.out.println("*************Autowiring using properties on random arr*******************");
		
		FortuneService fortuneService = context.getBean("randomFortune",FortuneService.class);
		System.out.println(fortuneService.getDailyFortune());
		
		context.close();

	}
}
