package com.codingraja.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.spring.domain.Customer;
import com.codingraja.spring.dto.CustomerDto;
import com.codingraja.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping("/register")
	public ModelAndView customerRegistrationPage() {
		return new ModelAndView("register", "customerDto", new CustomerDto());
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView processCustomerRegistration(@ModelAttribute @Validated CustomerDto customerDto, BindingResult result) {
		if(result.hasErrors())
			return new ModelAndView("register", "customerDto", customerDto);
		else {
			String pass1 = customerDto.getPassword();
			String pass2 = customerDto.getConfirmPassword();
			if(!pass1.equals(pass2)) {
				result.rejectValue("confirmPassword","confirmPassword.invalid", "Password and Confirm Password must be same");
				return new ModelAndView("register", "customerDto", customerDto);
			}
			
			if(customerDto.getId() != null)
				customerService.updateCustomer(customerDto);
			else
				customerService.saveCustomer(customerDto);

			return new ModelAndView("redirect:/customer/all");
		}	
	} 
	
	@RequestMapping("/all")
	public ModelAndView customerListingPage() {
		return new ModelAndView("customerListPage", "customerList", customerService.findAllCustomers());
	}
	
	@RequestMapping("/{id}/update")
	public ModelAndView updateCustomer(@PathVariable Long id) {
		Customer customer = customerService.findCustomerById(id);
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(customer.getId());
		customerDto.setFirstName(customer.getFirstName());
		customerDto.setLastName(customer.getLastname());
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobile(customer.getMobile());
		
		return new ModelAndView("register", "customerDto",customerDto );
	}
	
	@RequestMapping("/{id}/delete")
	public String deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customer/all";
	}
}
