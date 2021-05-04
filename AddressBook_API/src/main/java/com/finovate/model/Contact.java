package com.finovate.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.finovate.dto.ContactDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.ToString;

@Data
@AllArgsConstructor

@ToString
@Entity
@Table(name = "contact")
public class Contact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7136241127330655227L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", columnDefinition = "BINARY(16)")
	private UUID id;
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	public Contact() {
		// no argument constructor
	}

	public Contact(ContactDTO contactDTO) { // argument constructor

		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
		this.emailId = contactDTO.emailId;
		this.mobileNumber = contactDTO.mobileNumber;

	}

}