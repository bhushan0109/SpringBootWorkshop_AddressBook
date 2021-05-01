package com.finovate.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.finovate.dto.ContactDTO;

import lombok.Data;

@Entity
@Table(name = "person_contact")
public @Data class PersonContactData {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "contactid", columnDefinition = "BINARY(16)")
	private UUID contactid;

	@NotNull
	@Size(max = 65)
	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "Invalid firstName")
	private String firstName;

	@NotNull
	@Size(max = 65)
	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "Invalid lastName")
	private String lastName;

	@NotNull
	@Email
	@Size(max = 100)
	@Pattern(regexp = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$", message = "Invalid name")
	private String emailId;

	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Invalid phone number")
	private String mobileNumber;

	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private PersonAddressData personAddressData;

	@CreationTimestamp
	private LocalDateTime created_on;
	@UpdateTimestamp
	private LocalDateTime updated_on;

	public PersonContactData() {
		// no argument constructor
	}

	public PersonContactData(ContactDTO contactDTO) { // argument constructor

		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
		this.emailId = contactDTO.emailId;
		this.mobileNumber = contactDTO.mobileNumber;

	}

	public PersonContactData(PersonContactData personContactData) {
		// TODO Auto-generated constructor stub
		this.firstName = personContactData.firstName;
		this.lastName = personContactData.lastName;
		this.emailId = personContactData.emailId;
		this.mobileNumber = personContactData.mobileNumber;
	}

}
