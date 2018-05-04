/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CL Verma
 *
 */
@Controller
public class LoginController {
	private static final String LOGIN_PAGE = "account/login";

	@GetMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView(LOGIN_PAGE);
	}
}
