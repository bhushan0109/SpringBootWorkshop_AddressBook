package com.finovate.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.finovate.exception.ContactException;

import com.finovate.model.Contact;
import com.finovate.repository.ContactRepository;

@Service
public class ContactService implements IContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contact createPersonData(Contact personContactData) {
		Contact contactData = new Contact();
		contactData.setEmailId(personContactData.getEmailId());
		contactData.setLastName(personContactData.getLastName());
		contactData.setMobileNumber(personContactData.getMobileNumber());
		contactData.setFirstName(personContactData.getFirstName());
		contactData.setAddress(personContactData.getAddress());
		contactData.setAddress(personContactData.getAddress());
		return contactRepository.save(contactData);
	}

	@Override
	public List<Contact> getPersonData() {
		return contactRepository.findAll();
	}

	@Override
	public Contact getContactById(UUID Id) {
		return contactRepository.findById(Id).orElseThrow(() -> new ContactException("details not found!"));
	}

	@Override
	public void deletPersonDataByid(UUID contId) {

		contactRepository.deleteById(contId);
	}

	@Override
	public List<Contact> sortByFirstName() {

		return contactRepository.findAll((Sort.by("firstName").ascending()));
	}

	@Override
	public Contact updateContactData(UUID contId, Contact prg) {

		Contact personContact = contactRepository.findById(contId).get();
		personContact.setFirstName(prg.getFirstName());
		personContact.setLastName(prg.getLastName());
		personContact.setEmailId(prg.getEmailId());
		personContact.setMobileNumber(prg.getMobileNumber());
		// personContact.setPersonAddressData(prg.getPersonAddressData());
		return contactRepository.save(personContact);

	}

}
