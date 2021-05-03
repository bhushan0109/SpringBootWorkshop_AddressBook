package com.finovate.service;

import java.util.List;
import java.util.UUID;

import com.finovate.model.Contact;

public interface IContactService {

	List<Contact> getPersonData();

	Contact getContactById(UUID Id);

	void deletPersonDataByid(UUID contId);

	List<Contact> sortByFirstName();

	Contact updateContactData(UUID contId, Contact prg);

	Contact createPersonData(Contact personContactData);

}
