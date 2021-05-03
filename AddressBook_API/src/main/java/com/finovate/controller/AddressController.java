package com.finovate.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finovate.dto.AddressDTO;
import com.finovate.dto.ResponseDTO;
import com.finovate.model.Address;
import com.finovate.service.IAddressService;

@RestController
@RequestMapping("/person/address")
public class AddressController {
	@Autowired
	private IAddressService addressService;

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressData(@Valid @RequestBody AddressDTO addressDTO) {
		Address personData = addressService.createAddressData(addressDTO);
		ResponseDTO responseDTO = new ResponseDTO("Successfully created the data ", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping(value = { "", "/", "/getall" })
	public ResponseEntity<ResponseDTO> getPersonAddressData() {
		List<Address> personData = addressService.getPersonAddressData();
		ResponseDTO responseDTO = new ResponseDTO("Successfull got the data", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{contId}")
	public ResponseEntity<ResponseDTO> updatePersonAdresssData(@Valid @PathVariable(value = "contId") UUID contId,
			@RequestBody AddressDTO addressDTO) {
		Address addressData = addressService.updatePersonAdresssData(contId, addressDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated address book of Id : ", addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{contId}")
	public ResponseEntity<ResponseDTO> getAddresById(@PathVariable(value = "contId") UUID contId) {
		Address addressData = addressService.getAddresById(contId);
		ResponseDTO responseDTO = new ResponseDTO("Successfully got the data ", addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{contId}")
	public ResponseEntity<ResponseDTO> deletPersonAddresssByid(@PathVariable UUID contId) {
		addressService.deletPersonAddresssByid(contId);
		ResponseDTO responseDTO = new ResponseDTO("Deleted successfully the address ", contId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping(value = { "/sort" })
	public ResponseEntity<ResponseDTO> sortBycityName() {
		List<Address> personData = addressService.sortBycityName();
		ResponseDTO responseDTO = new ResponseDTO("Successfull got the data", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}