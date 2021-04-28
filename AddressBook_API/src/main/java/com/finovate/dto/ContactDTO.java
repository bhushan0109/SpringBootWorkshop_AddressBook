package com.finovate.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class ContactDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$", message = "Invalid name")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$", message = "Invalid name")
	public String lastName; 
	
	@Pattern(regexp ="^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$", message = "Invalid name")
	public String emailId;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Invalid phone number")
	public String mobileNumber;
	

	public ContactDTO(String firstName, String lastName, String emailId, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
		
	

}
