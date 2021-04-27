package com.finovate.service;

import org.springframework.stereotype.Service;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;
@Service
public class ContractService implements IContactService {
	@Override
	public PersonContactData createPersonData(ContactDTO contctDTO) {
		PersonContactData contactData =new PersonContactData(1,contctDTO);
		return contactData;
	}
}
