package com.finovate.dto;

import javax.validation.constraints.NotEmpty;

import lombok.ToString;

public  @ToString class AddressDTO {
	
	@NotEmpty(message = "Address cannot be null")
	public String address;
	
	@NotEmpty(message = "city cannot be null")
	public String city;
	
	@NotEmpty(message = "state cannot be null")
	public String state;
	
	@NotEmpty(message = "zipcode cannot be null")
	public long zipCode;

	public AddressDTO(String address, String city, String state, long zipCode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

}