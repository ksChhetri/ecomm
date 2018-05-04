package com.codingraja.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.spring.dao.CustomerDao;
import com.codingraja.spring.domain.Customer;
import com.codingraja.spring.dto.CustomerDto;
import com.codingraja.spring.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	public CustomerServiceImpl(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Transactional
	public Long saveCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastname(customerDto.getLastName());
		customer.setEmail(customerDto.getEmail());
		customer.setMobile(customerDto.getMobile());
		
		return customerDao.saveCustomer(customer);
	}

	@Transactional
	public Customer findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Transactional
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return this.customerDao.findAllCustomers();
	}

	@Transactional
	public boolean updateCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setId(customerDto.getId());
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastname(customerDto.getLastName());
		customer.setEmail(customerDto.getEmail());
		customer.setMobile(customerDto.getMobile());
		
		return customerDao.updateCustomer(customer);
	}

	@Transactional
	public boolean deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerById(id);
	}

}
