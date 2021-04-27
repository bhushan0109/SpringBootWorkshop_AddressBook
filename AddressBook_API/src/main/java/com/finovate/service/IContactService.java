package com.finovate.service;

import java.util.List;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;

public interface IContactService {

	PersonContactData createPersonData(ContactDTO contctDTO);

	List<PersonContactData> getPersonData();

	PersonContactData getContactById(int Id);

}
