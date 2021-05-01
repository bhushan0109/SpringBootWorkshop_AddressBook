package com.finovate.service;

import java.util.List;
import java.util.UUID;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;

public interface IContactService {

	List<PersonContactData> getPersonData();

	PersonContactData getContactById(UUID Id);

	void deletPersonDataByid(UUID contId);

	List<PersonContactData> sortByFirstName();

	PersonContactData createPersonData(PersonContactData personContactData);

	PersonContactData updateContactData(UUID contId, PersonContactData prg);

}
