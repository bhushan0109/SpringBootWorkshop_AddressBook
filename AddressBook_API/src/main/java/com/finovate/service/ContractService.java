package com.finovate.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.finovate.exception.ContactException;
import com.finovate.model.PersonContactData;
import com.finovate.repository.ContactRepository;

@Service
public class ContractService implements IContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public PersonContactData createPersonData(PersonContactData personContactData) {
		PersonContactData contactData = new PersonContactData();
		contactData.setEmailId(personContactData.getEmailId());
		contactData.setLastName(personContactData.getLastName());
		contactData.setMobileNumber(personContactData.getMobileNumber());
		contactData.setFirstName(personContactData.getFirstName());
		contactData.setPersonAddressData(personContactData.getPersonAddressData());
		return contactRepository.save(contactData);
	}

	@Override
	public List<PersonContactData> getPersonData() {
		return contactRepository.findAll();
	}

	@Override
	public PersonContactData getContactById(UUID Id) {
		return contactRepository.findById(Id).orElseThrow(() -> new ContactException("details not found!"));
	}

	@Override
	public void deletPersonDataByid(UUID contId) {

		contactRepository.deleteById(contId);
	}

	@Override
	public List<PersonContactData> sortByFirstName() {

		return contactRepository.findAll((Sort.by("firstName").ascending()));
	}

	@Override
	public PersonContactData updateContactData(UUID contId, PersonContactData prg) {

		PersonContactData personContact = contactRepository.findById(contId).get();
		personContact.setFirstName(prg.getFirstName());
		personContact.setLastName(prg.getLastName());
		personContact.setEmailId(prg.getEmailId());
		personContact.setMobileNumber(prg.getMobileNumber());
		personContact.setPersonAddressData(prg.getPersonAddressData());
		return contactRepository.save(personContact);

	}

}
