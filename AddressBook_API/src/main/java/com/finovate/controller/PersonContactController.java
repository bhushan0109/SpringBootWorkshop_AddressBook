package com.finovate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<ResponseDTO> createPersonData(@RequestBody ContactDTO contactDTO) {
		PersonContactData personData = contactService.createPersonData(contactDTO);
		ResponseDTO responseDTO = new ResponseDTO("Successfully created the data ", personData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}
