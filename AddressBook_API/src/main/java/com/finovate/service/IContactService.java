package com.finovate.service;

import java.util.List;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;
import org.springframework.data.domain.Sort;

public interface IContactService {

	PersonContactData createPersonData(ContactDTO contctDTO);

	List<PersonContactData> getPersonData();

	PersonContactData getContactById(int Id);

	PersonContactData updateContactData(int contId, ContactDTO contctDTO);

	void deletPersonDataByid(int contId);

	List<PersonContactData> sortByFirstName();

}
