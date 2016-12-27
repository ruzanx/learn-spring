package com.ruzanx.spring.learn.service;

import java.util.List;

import com.ruzanx.spring.learn.model.Customer;
import com.ruzanx.spring.learn.repository.CustomerRepository;
import com.ruzanx.spring.learn.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.ruzanx.spring.learn.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
