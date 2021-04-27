package com.finovate.dto;

public class ContactDTO {
	private String firstName;
	private String lastName; // variable and fields of contact person
	private String emailId;
	private String mobileNumber;

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
