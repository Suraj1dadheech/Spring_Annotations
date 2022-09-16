package com.suraj.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DullFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Bad Luck!! next time";
	}

}
