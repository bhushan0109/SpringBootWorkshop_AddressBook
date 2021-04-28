package com.finovate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.finovate.dto.ContactDTO;

import lombok.Data;

@Entity
@Table(name = "person_contact")
public @Data class PersonContactData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	private int contactBookId;

	private String firstName;
	private String lastName; // variable and fields of contact person
	private String emailId;
	private String mobileNumber;

	public PersonContactData() {
		// no argument constructor
	}

	public PersonContactData(ContactDTO contactDTO) { // argument constructor

		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
		this.emailId = contactDTO.emailId;
		this.mobileNumber = contactDTO.mobileNumber;

	}

}
