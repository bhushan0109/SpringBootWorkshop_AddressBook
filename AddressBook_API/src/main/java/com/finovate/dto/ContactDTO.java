package com.finovate.dto;

public class ContactDTO {
	public String firstName;
	public String lastName; // variable and fields of contact person
	public String emailId;
	public String mobileNumber;

	public ContactDTO(String firstName, String lastName, String emailId, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
		
	@Override
	public String toString() {
		return "ContactDTO [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}
