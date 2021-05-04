package com.finovate.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.finovate.dto.ContactDTO;
import com.finovate.exception.AddressException;
import com.finovate.exception.ContactException;
import com.finovate.model.Address;
import com.finovate.model.Contact;
import com.finovate.repository.AddressRepository;
import com.finovate.repository.ContactRepository;

@Service
public class ContactService implements IContactService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contact createContact(ContactDTO contactDTO) {
		Contact contact= new Contact( contactDTO);
		
		//List<Address> address = (List<Address>) addressRepository.findById(UUID.fromString(contactDTO.addressID)).orElseThrow(()-> new AddressException("details not found!"));
		//contact.setAddress(address);
		return contactRepository.save(contact);
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
	public Contact updateContactData(UUID contId, Contact ctn) {

		Contact personContact = contactRepository.findById(contId).get();
		
		personContact.setFirstName(ctn.getFirstName());
		personContact.setLastName(ctn.getLastName());
		personContact.setEmailId(ctn.getEmailId());
		personContact.setMobileNumber(ctn.getMobileNumber());
		personContact.setAddress(ctn.getAddress());
		return contactRepository.save(personContact);


	}
public List<Address> addAddressToContact(String contactId, String addressId) {
		
		Address address = addressRepository.findById(UUID.fromString(addressId)).orElseThrow(()-> new AddressException("details not found!"));
	
		Contact contact=contactRepository.findById(UUID.fromString(contactId)).orElseThrow(()-> new AddressException("details not found!"));
		List<Address> addresses = contact.getAddress();
		addresses.add(address);
		return contactRepository.save(contact).getAddress();
		
		
	
	}

}
