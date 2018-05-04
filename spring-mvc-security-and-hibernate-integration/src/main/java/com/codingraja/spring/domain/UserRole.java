/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.spring.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name="SPRING_USER_ROLE_24042017")
public class UserRole implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ROLE_ID")
	private Long roleId;
	@Column(name="ROLE")
	private String role;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;
	
	public UserRole(){}
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
