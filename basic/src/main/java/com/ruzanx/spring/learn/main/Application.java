package com.ruzanx.spring.learn.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruzanx.spring.learn.config.AppConfig;
import com.ruzanx.spring.learn.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);


	}
}
