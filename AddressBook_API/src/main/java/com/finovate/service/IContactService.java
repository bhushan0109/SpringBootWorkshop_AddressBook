package com.finovate.service;

import java.util.List;
import java.util.UUID;

import com.finovate.dto.ContactDTO;
import com.finovate.model.Address;
import com.finovate.model.Contact;

public interface IContactService {

	List<Contact> getPersonData();

	Contact getContactById(UUID Id);

	void deletPersonDataByid(UUID contId);

	List<Contact> sortByFirstName();

	Contact updateContactData(UUID contId, Contact prg);

	Contact createContact(ContactDTO contactDTO);

	public List<Address>addAddressToContact(String contactId, String addressId) ;

	Contact addContactToAddress(String contactId, String addressId);
	

}
