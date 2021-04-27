package com.finovate.model;

public class PersonAddress {
	private int AddessBookId;
	private String address;
	private String city; 								// variable and fields of person address
	private String state;
	private String zipCode;

	public PersonAddress() {
		
	}

	public PersonAddress(int addessBookId, String address, String city, String state, String zipCode) {
		super();
		AddessBookId = addessBookId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "PersonAddress [AddessBookId=" + AddessBookId + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}

}
