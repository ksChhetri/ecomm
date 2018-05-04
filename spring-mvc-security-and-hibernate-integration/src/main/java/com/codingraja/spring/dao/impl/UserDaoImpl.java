/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.spring.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.codingraja.spring.dao.UserDao;
import com.codingraja.spring.domain.User;

/**
 * @author CL Verma
 *
 */
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;	
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	/* (non-Javadoc)
	 * @see com.codingraja.spring.dao.UserDao#findUserByUsername(java.lang.String)
	 */
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return (User)this.sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.add(Restrictions.eq("username", username))
				.list().get(0);
	}

}
