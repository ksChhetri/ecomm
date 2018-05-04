package com.codingraja.spring.dao;

import java.util.List;

import com.codingraja.spring.domain.Customer;

public interface CustomerDao {
	Long saveCustomer(Customer customer);
	Customer findCustomerById(Long id);
	List<Customer> findAllCustomers();
	boolean updateCustomer(Customer customer);
	boolean deleteCustomerById(Long id);
}
