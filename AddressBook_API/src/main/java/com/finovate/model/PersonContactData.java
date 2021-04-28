package com.finovate.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdDate")
	private java.util.Calendar createdDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private java.util.Calendar modifiedDate;

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
