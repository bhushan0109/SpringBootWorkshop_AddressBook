package com.finovate.model;



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

import com.finovate.dto.AddressDTO;

import lombok.Data;


@Entity
@Table(name= "person_address")
public @Data class PersonAddressData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int AddessBookId;
	private String address;
	private String city; // variable and fields of person address
	private String state;
	private String zipCode;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdDate")
	private java.util.Calendar createdDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private java.util.Calendar modifiedDate;

	public PersonAddressData() {

	}

	public PersonAddressData( AddressDTO addressDTO) {

		this.address = addressDTO.address;
		this.city = addressDTO.city;
		this.state = addressDTO.state;
		this.zipCode = addressDTO.zipCode;

	}

}
