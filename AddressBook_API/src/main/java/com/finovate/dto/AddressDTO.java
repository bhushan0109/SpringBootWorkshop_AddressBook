package com.finovate.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressDTO {

	@NotEmpty(message = "Address cannot be null")
	public String address;

	@NotEmpty(message = "city cannot be null")
	public String city;

	@NotEmpty(message = "state cannot be null")
	public String state;

	@Pattern(regexp = "^[1-9]{1}[0-9]{5}$", message = "Invalid zip code")
	public String zipCode;

	public AddressDTO(String address, String city, String state, String zipCode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

}