package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SchedulerDemoApplication.class, args);
	/*	MyTImerTask tImerTask= new MyTImerTask();
		Timer timer=new Timer();
		timer.schedule(tImerTask,1000);*/

	}

}



