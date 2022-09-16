package com.suraj.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {
	
	@Value("${foo.good}")
	private String good;
	
	@Value("${foo.mid}")
	private String mid;
	
	@Value("${foo.bad}")
	private String bad;
	
	@Value("${foo.faith}")
	private String faith;
	
	private String arr[]= {good,mid,bad,faith};
	
	@Override
	public String getDailyFortune() {
		Random random = new Random();
		int a= random.nextInt(arr.length);
		System.out.println("Random: "+a);
		for(String value:arr)
			System.out.println(value);
		return arr[a];
	}

}
