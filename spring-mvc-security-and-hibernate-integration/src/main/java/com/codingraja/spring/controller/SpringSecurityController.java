/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CL Verma
 *
 */

@Controller
public class SpringSecurityController {
	
	@GetMapping("/admin")
	public String adminPage(Model model) {
		model.addAttribute("title", "This is Admin Page");
		model.addAttribute("message", "Only Admin Can access this Page!");
		return "admin";
	}
	
	@GetMapping("/user")
	public String userPage(Model model) {
		model.addAttribute("title", "This is User Page");
		model.addAttribute("message", "Admin and User both Can access this Page!");
		return "user";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
}
