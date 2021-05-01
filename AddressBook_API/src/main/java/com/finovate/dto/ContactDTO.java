package com.finovate.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;
@Data
public @ToString class ContactDTO {
	@NotNull
	@Size(max = 65)
	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "Invalid firstName")
	public String firstName;
	@NotNull
	@Size(max = 65)
	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "Invalid lastName")
	public String lastName;
	@NotNull
    @Email
    @Size(max = 100)
	@Pattern(regexp = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$", message = "Invalid name")
	public String emailId;

	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Invalid phone number")
	public String mobileNumber;

}
