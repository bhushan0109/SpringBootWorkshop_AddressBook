package com.finovate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finovate.dto.ContactDTO;
import com.finovate.exception.AddressException;
import com.finovate.exception.ContactException;
import com.finovate.model.PersonContactData;

@Service
public class ContractService implements IContactService {
	List<PersonContactData> contactList = new ArrayList<PersonContactData>();

	@Override
	public PersonContactData createPersonData(ContactDTO contctDTO) {

		PersonContactData contactData = null;
		contactData = new PersonContactData(contactList.size() + 1, contctDTO);
		contactList.add(contactData);
		return contactData;
	}

	@Override
	public List<PersonContactData> getPersonData() {

		return contactList;
	}

	@Override
	public PersonContactData getContactById(int Id) {

		return contactList.stream().filter(bookData -> bookData.getContactBookId() == Id).findFirst()
				.orElseThrow(() -> new ContactException("Contact entry Not found"));
	}

	@Override
	public PersonContactData updateContactData(int contId, ContactDTO contctDTO) {
		PersonContactData contactData = this.getContactById(contId);
		contactData.setEmailId(contctDTO.emailId);
		contactData.setFirstName(contctDTO.firstName);
		contactData.setLastName(contctDTO.lastName);
		contactData.setMobileNumber(contctDTO.mobileNumber);
		contactList.set(contId - 1, contactData);
		return contactData;
	}

	@Override
	public void deletPersonDataByid(int contId) {
		contactList.remove(contId - 1);

	}

}
