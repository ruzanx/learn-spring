package com.ruzanx.spring.learn.repository;

import java.util.List;

import com.ruzanx.spring.learn.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}