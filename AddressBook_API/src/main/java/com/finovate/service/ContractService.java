package com.finovate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;

@Service
public class ContractService implements IContactService {
	@Override
	public PersonContactData createPersonData(ContactDTO contctDTO) {
		PersonContactData contactData = new PersonContactData(1, contctDTO);
		return contactData;
	}

	@Override
	public List<PersonContactData> getPersonData() {
		List<PersonContactData> personList = new ArrayList<PersonContactData>();
		personList.add(new PersonContactData(1, new ContactDTO("rahul", "patil", "rahul@gmail.com", "876554568")));
		return personList;
	}

	@Override
	public PersonContactData getContactById(int Id) {

		PersonContactData contactData = new PersonContactData(1,
				new ContactDTO("raj", "patil", "rahul@gmail.com", "876554568"));
		return contactData;
	}

}
