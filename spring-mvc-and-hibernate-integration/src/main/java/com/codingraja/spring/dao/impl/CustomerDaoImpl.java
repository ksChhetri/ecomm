package com.codingraja.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.spring.dao.CustomerDao;
import com.codingraja.spring.domain.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public CustomerDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}	

	public Long saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return (Long)this.sessionFactory.getCurrentSession()
				.save(customer);
	}

	public Customer findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
					.get(Customer.class, id);
	}

	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
					.createCriteria(Customer.class)
					.list();
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession()
			.update(customer);
		return true;
	}

	public boolean deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		Customer customer = this.sessionFactory.getCurrentSession()
				.get(Customer.class, id);
		
		this.sessionFactory.getCurrentSession()
			.delete(customer);
		
		return true;
	}
}
