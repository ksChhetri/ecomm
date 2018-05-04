package com.codingraja.spring.service;

import java.util.List;

import com.codingraja.spring.domain.Customer;
import com.codingraja.spring.dto.CustomerDto;

public interface CustomerService {
	Long saveCustomer(CustomerDto customerDto);
	Customer findCustomerById(Long id);
	List<Customer> findAllCustomers();
	boolean updateCustomer(CustomerDto customerDto);
	boolean deleteCustomerById(Long id);
}
