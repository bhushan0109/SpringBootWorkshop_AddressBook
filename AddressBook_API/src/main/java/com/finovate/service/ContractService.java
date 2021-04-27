package com.finovate.service;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;

public class ContractService implements IContactService {

	@Override
	public PersonContactData createPersonData(ContactDTO contctDTO) {
		PersonContactData contactData =new PersonContactData(1,contctDTO);
		return contactData;
	}
}
