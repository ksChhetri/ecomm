package com.codingraja.spring.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class CustomerDto {
	@NotEmpty(message="First Name can't be Empty!")
	private String firstName;
	@NotEmpty(message="Last Name can't be Empty!")
	private String lastName;
	
	@NotEmpty(message="Email can't be Empty!")
	@Email(message="Invalid Email Id")
	private String email;
	
	@Pattern(regexp="[789][0-9]{9}", message="Invalid Mobile Number")
	private String mobile;
	
	@NotEmpty(message="Password can't be Empty!")
	@Size(min=6, max=10, message="Password Should be 6 to 10")
	private String password;
	@NotEmpty(message="Confirm Password can't be Empty!")
	@Size(min=6, max=10, message="Confirm Password Should be 6 to 10")
	private String confirmPassword;
	
	public CustomerDto(){}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}	
}
