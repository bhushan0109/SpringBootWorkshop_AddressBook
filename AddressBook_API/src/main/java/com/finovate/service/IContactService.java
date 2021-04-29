package com.finovate.service;

import java.util.List;
import java.util.UUID;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;

public interface IContactService {

	PersonContactData createPersonData(ContactDTO contctDTO);

	List<PersonContactData> getPersonData();

	PersonContactData getContactById(UUID Id);

	PersonContactData updateContactData(UUID contId, ContactDTO contctDTO);

	void deletPersonDataByid(UUID contId);

	List<PersonContactData> sortByFirstName();

}
