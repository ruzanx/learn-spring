package com.ruzanx.spring.learn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.ruzanx.spring.learn.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUser}")
	private String dbUser;
	
	/* (non-Javadoc)
	 * @see com.ruzanx.spring.learn.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(this.dbUser);
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Ruzan");
		customer.setLastName("Mohamed");
		customers.add(customer);
		return customers;
	}
}
