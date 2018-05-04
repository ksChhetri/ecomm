package com.codingraja.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.spring.domain.CustomerDto;

@Controller
public class CustomerController {

	@RequestMapping("/register")
	public ModelAndView customerRegistrationPage() {
		return new ModelAndView("register","customerDto",new CustomerDto());
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView processCustomerRegistration(@ModelAttribute CustomerDto customerDto) {
		customerDto.setId(110001);
		return new ModelAndView("regSuccess","customer", customerDto);
	}
}
