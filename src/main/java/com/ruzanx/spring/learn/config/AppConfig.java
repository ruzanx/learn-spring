package com.ruzanx.spring.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ruzanx.spring.learn.repository.CustomerRepository;
import com.ruzanx.spring.learn.repository.HibernateCustomerRepositoryImpl;
import com.ruzanx.spring.learn.service.CustomerService;
import com.ruzanx.spring.learn.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.ruzanx.spring.learn"})
public class AppConfig {
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService(){
////		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
//	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}
}
