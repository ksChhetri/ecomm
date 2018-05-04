/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.spring.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.spring.dao.UserDao;
import com.codingraja.spring.domain.User;
import com.codingraja.spring.domain.UserRole;

/**
 * @author CL Verma
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService {
	
	private UserDao userDao;
	public UserDetailsServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//Getting the User by Username from Database		
		User user = this.userDao.findUserByUsername(username);
		
		/*convert Set<UserRole> to Set<GrantedAuthority>
		 *@See loadUserRoleByUsername()
		 */
		Set<GrantedAuthority> authorities = loadUserRoleByUsername(user.getUserRoles());
		
		/*convert com.codingraja.spring.domain.User to
		 * org.springframework.security.core.userdetails.User and return
		 *@See convertUserToSpringSecurityUser()
		 */
		return convertUserToSpringSecurityUser(user, authorities);
	}
	
	/* 
	 * This method is used to convert Set<UserRole> to Set<GrantedAuthority>
	 */
	private Set<GrantedAuthority> loadUserRoleByUsername(Set<UserRole> userRoles) {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		
		for (UserRole userRole : userRoles) {
			authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return authorities;
	}
	
	/* 
	 * This method is used to convert User to Spring Security User Object
	 */
	private UserDetails convertUserToSpringSecurityUser(final User user, final Set<GrantedAuthority> authorities) {
		return new org.springframework.security.core.userdetails.User(user.getUsername(), 
																	  user.getPassword(), 
																	  user.isEnabled(), 
																	  true, //accountNonExpired 
																	  true, //credentialsNonExpired
																	  true, //accountNonLocked
																	  authorities);			
	}
}
