package com.suraj.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("Fortune Constructor called");
	}
	
	@PostConstruct
	public void StartMethod()throws Exception
    {

        File file = new File(
            "E:\\test.txt");
 
        BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        String st;
        
        while ((st = br.readLine()) != null)
            System.out.println(st);
		
	}
	
	@PreDestroy
	public void fun()
	{System.out.println("Fortune_after constructor");}

	@Override
	public String getDailyFortune() {
		return "You have luckey day ahead!";

	}

}
