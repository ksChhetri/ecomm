package com.codingraja.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping("/register")
	public ModelAndView processRegstration(HttpServletRequest request) {
	
		String username = request.getParameter("username");
		return new ModelAndView("regSuccess", "user", username);
	}
}
