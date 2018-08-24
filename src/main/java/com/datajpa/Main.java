package com.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Component
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

@SuppressWarnings("unused")
ConfigurableApplicationContext context= SpringApplication.run(Main.class,args);

	
	}

}
