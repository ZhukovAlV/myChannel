package com.example.myChannel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyChannelApplication {

	public static void main(String[] args) {
		System.out.println("Start myChannel application");
		SpringApplication.run(MyChannelApplication.class, args);
		System.out.println("Stop myChannel application");
	}
}
