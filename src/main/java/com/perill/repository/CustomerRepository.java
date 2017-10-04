package com.perill.repository;

import java.util.List;

import com.perill.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}