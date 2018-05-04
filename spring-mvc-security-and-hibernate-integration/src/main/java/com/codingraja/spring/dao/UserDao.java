/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.spring.dao;

import com.codingraja.spring.domain.User;

/**
 * @author CL Verma
 *
 */
public interface UserDao {
	User findUserByUsername(String username);
}
