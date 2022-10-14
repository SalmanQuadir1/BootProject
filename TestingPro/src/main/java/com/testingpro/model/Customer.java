package com.testingpro.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Customer {
	
    @NotNull
    @Min(value=5,message="five characters allowed")
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	
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
	 public Customer() {
		 
	 }
	public Customer( String firstName,  String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
