package com.finovate.model;

import com.finovate.dto.AddressDTO;

public class PersonAddress {
	private int AddessBookId;
	private String address;
	private String city; 								// variable and fields of person address
	private String state;
	private long zipCode;

	public PersonAddress() {
		
	}

	public PersonAddress(int addessBookId, AddressDTO addressDTO) {
		
		this.AddessBookId = addessBookId;
		this.address = addressDTO.address;
		this.city = addressDTO.city;
		this.state = addressDTO.state;
		this.zipCode = addressDTO.zipCode;
	}


	public int getAddessBookId() {
		return AddessBookId;
	}

	public void setAddessBookId(int addessBookId) {
		AddessBookId = addessBookId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "PersonAddress [AddessBookId=" + AddessBookId + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}

}
