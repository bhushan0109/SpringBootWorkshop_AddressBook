package com.finovate.dto;

import java.util.UUID;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AddressDTO {
	
	public UUID aid;
	@NotEmpty(message = "Address cannot be null")
	public String address;

	@NotEmpty(message = "city cannot be null")
	public String city;

	@NotEmpty(message = "state cannot be null")
	public String state;

	@Pattern(regexp = "^[1-9]{1}[0-9]{5}$", message = "Invalid zip code")
	public String zipCode;

}