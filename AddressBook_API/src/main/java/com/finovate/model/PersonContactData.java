package com.finovate.model;

import com.finovate.dto.ContactDTO;

import lombok.Data;
@Data
public class PersonContactData {
	private int contactBookId;
	private String firstName;
	private String lastName;				//variable and fields of contact person 
	private String emailId;
	private String mobileNumber;

	public PersonContactData() {
											//no argument constructor
	}

	public PersonContactData(int contactBookId, ContactDTO contactDTO ) {  //argument constructor
		
		this.contactBookId = contactBookId;
		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
		this.emailId = contactDTO.emailId;
		this.mobileNumber = contactDTO.mobileNumber;
	}


}
