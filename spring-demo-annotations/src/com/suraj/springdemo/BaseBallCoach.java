package com.suraj.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component 
public class BaseBallCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("dullFortune")
	private FortuneService dullfortuneService;
	
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return dullfortuneService.getDailyFortune();
	}

}
