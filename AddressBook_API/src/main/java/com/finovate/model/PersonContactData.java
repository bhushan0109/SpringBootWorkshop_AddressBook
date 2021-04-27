package com.finovate.model;

import com.finovate.dto.ContactDTO;

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

	public int getContactBookId() {
		return contactBookId;
	}

	public void setContactBookId(int contactBookId) {
		this.contactBookId = contactBookId;
	}

	public String getFirstName() {
		return firstName;																	//getter and setter
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {					//o/p toString override
		return "PersonContact [contactBookId=" + contactBookId + ", firstName=" + firstName + ", lastName=" + lastName		
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}

}
