package com.ruzanx.spring.learn.repository;

import java.util.ArrayList;
import java.util.List;

import com.ruzanx.spring.learn.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.ruzanx.spring.learn.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Ruzan");
		customer.setLastName("Mohamed");
		customers.add(customer);
		return customers;
	}
}
