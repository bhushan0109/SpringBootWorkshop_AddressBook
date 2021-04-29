package com.finovate.service;

import java.util.List;
import java.util.UUID;

import com.finovate.dto.AddressDTO;
import com.finovate.model.PersonAddressData;

public interface IAddressService {

	PersonAddressData createAddressData(AddressDTO addressDTO);

	List<PersonAddressData> getPersonAddressData();

	PersonAddressData getAddresById(UUID Id);
	
	PersonAddressData updatePersonAdresssData(UUID contId, AddressDTO addressDTO);

	void deletPersonAddresssByid(UUID contId);

	List<PersonAddressData> sortBycityName();
	
}