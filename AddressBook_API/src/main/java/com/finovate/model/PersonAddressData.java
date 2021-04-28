package com.finovate.model;

import com.finovate.dto.AddressDTO;

import lombok.Data;

@Data
public class PersonAddressData {
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
