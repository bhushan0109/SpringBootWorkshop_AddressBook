package com.finovate.controller;

import java.util.List;

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

import com.finovate.dto.ContactDTO;
import com.finovate.dto.ResponseDTO;
import com.finovate.model.PersonContactData;
import com.finovate.service.IContactService;

@RestController
@RequestMapping("/person")
public class PersonContactController {
	@Autowired
	private IContactService contactService;

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createPersonData(@Valid @RequestBody ContactDTO contactDTO) {
		PersonContactData personData = contactService.createPersonData(contactDTO);
		ResponseDTO responseDTO = new ResponseDTO("Successfully created the data ", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getPersonData() {
		List<PersonContactData> personData = contactService.getPersonData();
		ResponseDTO responseDTO = new ResponseDTO("Successfull got the data", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{contId}")
	public ResponseEntity<ResponseDTO> findByFastName(@PathVariable("contId") int contId) {
		PersonContactData personData = contactService.getContactById(contId);
		ResponseDTO responseDTO = new ResponseDTO("Successfully got the data ", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/{contId}")
	public ResponseEntity<ResponseDTO> updateContactData(@Valid @PathVariable("contId") int contId,
			@RequestBody ContactDTO contactDTO) {
		PersonContactData personData = contactService.updateContactData(contId, contactDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated address book of Id : ", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/{contId}")
	public ResponseEntity<ResponseDTO> deletPersonDataByid(@PathVariable("contId") int contId) {
		contactService.deletPersonDataByid(contId);
		ResponseDTO responseDTO = new ResponseDTO("Deleted successfully the contact ", contId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	@GetMapping(value = { "/sort" })
	public ResponseEntity<ResponseDTO> sortByFirstName() {
		List<PersonContactData> personData = contactService.sortByFirstName();
		ResponseDTO responseDTO = new ResponseDTO("Successfull got the data", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}
