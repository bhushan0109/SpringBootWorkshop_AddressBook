package com.finovate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.finovate.dto.ContactDTO;

import com.finovate.exception.ContactException;
import com.finovate.model.PersonContactData;
import com.finovate.repository.ContactRepository;

@Repository
@Service
public class ContractService implements IContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public PersonContactData createPersonData(ContactDTO contactDTO) {

		PersonContactData contactData = new PersonContactData(contactDTO);

		return contactRepository.save(contactData);

	}

	@Override
	public List<PersonContactData> getPersonData() {

		return contactRepository.findAll();
	}

	@Override
	public PersonContactData getContactById(int Id) {
		return contactRepository.findById(Id).orElseThrow(() -> new ContactException("details not found!"));
	}

	@Override
	public PersonContactData updateContactData(int contId, ContactDTO contctDTO) {
		PersonContactData contactData = this.getContactById(contId);
		contactData.setEmailId(contctDTO.emailId);
		contactData.setFirstName(contctDTO.firstName);
		contactData.setLastName(contctDTO.lastName);
		contactData.setMobileNumber(contctDTO.mobileNumber);

		return contactRepository.save(contactData);
	}

	@Override
	public void deletPersonDataByid(int contId) {
		PersonContactData contactData = this.getContactById(contId);
		contactRepository.delete(contactData);
	}

	@Override
	public List<PersonContactData> sortByFirstName() {

		return contactRepository.findAll((Sort.by("firstName").ascending()));
	}

}
