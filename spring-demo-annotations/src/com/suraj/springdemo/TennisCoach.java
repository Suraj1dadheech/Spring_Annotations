package com.suraj.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {
	
	
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("Constructor is called");
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Code after constructor");
	}
	
//	@PreDestroy
//	public void DestroyMethod() {
//		System.out.println("Before Bean Destroy");
//	}
	
	
	//Autowiring using constructor
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService=fortuneService;
//	}
	
	//Autowiring using Setters method
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before Bean Destroy");
		
	}

}
