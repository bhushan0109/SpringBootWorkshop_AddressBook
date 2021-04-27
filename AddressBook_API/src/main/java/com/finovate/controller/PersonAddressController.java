package com.finovate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finovate.dto.AddressDTO;
import com.finovate.dto.ResponseDTO;
import com.finovate.model.PersonAddressData;
import com.finovate.service.IAddressService;

@RestController
@RequestMapping("/person/address")
public class PersonAddressController {
	@Autowired
	private IAddressService addressService;

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressData(@RequestBody AddressDTO addressDTO) {
		PersonAddressData personData = addressService.createAddressData(addressDTO);
		ResponseDTO responseDTO = new ResponseDTO("Successfully created the data ", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getPersonAddressData() {
		List<PersonAddressData> personData = addressService.getPersonAddressData();
		ResponseDTO responseDTO = new ResponseDTO("Successfull got the data", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}