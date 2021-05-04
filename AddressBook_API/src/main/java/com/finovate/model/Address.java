package com.finovate.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.finovate.dto.AddressDTO;

import lombok.Data;

@Entity
@Table(name = "address")
public @Data class Address implements Serializable {

	private static final long serialVersionUID = -3250047728703496066L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", columnDefinition = "BINARY(16)")
	private UUID id;
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
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	@JsonIgnore
	private Contact contact;

	public Address() {

	}

	public Address(AddressDTO addressDTO) {

		this.address = addressDTO.address;
		this.city = addressDTO.city;
		this.state = addressDTO.state;
		this.zipCode = addressDTO.zipCode;

	}

}