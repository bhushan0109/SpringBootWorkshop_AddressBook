package com.finovate.model;

import java.time.LocalDateTime;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.finovate.dto.AddressDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person_address")
@Getter
@Setter
public @Data class PersonAddressData {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "addressid", columnDefinition = "BINARY(16)")
	private UUID addressId;

	@NotEmpty(message = "Address cannot be null")
	private String address;

	@NotEmpty(message = "city cannot be null")
	private String city; // variable and fields of person address

	@NotEmpty(message = "state cannot be null")
	private String state;

	@Pattern(regexp = "^[1-9]{1}[0-9]{5}$", message = "Invalid zip code")
	private String zipCode;

	@CreationTimestamp
	private LocalDateTime created_on;
	@UpdateTimestamp
	private LocalDateTime updated_on;

	public PersonAddressData() {

	}

	public PersonAddressData(AddressDTO addressDTO) {

		this.address = addressDTO.address;
		this.city = addressDTO.city;
		this.state = addressDTO.state;
		this.zipCode = addressDTO.zipCode;

	}

}