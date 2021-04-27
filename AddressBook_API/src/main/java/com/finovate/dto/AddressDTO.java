package com.finovate.dto;

public class AddressDTO {
	public String address;
	public String city;
	public String state;
	public long zipCode;

	public AddressDTO(String address, String city, String state, long zipCode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "AddressDTO [address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

}