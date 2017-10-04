package com.perill.repository;

import java.util.ArrayList;
import java.util.List;

import com.perill.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.perill.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Connor");
		customer.setLastName("Perill");

		customers.add(customer);
		
		return customers;
	}

}
