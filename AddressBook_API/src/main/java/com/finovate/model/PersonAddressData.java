package com.finovate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	public PersonAddressData() {

	}

	public PersonAddressData(int addessBookId, AddressDTO addressDTO) {

		this.AddessBookId = addessBookId;
		this.address = addressDTO.address;
		this.city = addressDTO.city;
		this.state = addressDTO.state;
		this.zipCode = addressDTO.zipCode;

	}

}
