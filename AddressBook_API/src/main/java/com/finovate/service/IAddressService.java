package com.finovate.service;

import java.util.List;

import com.finovate.dto.AddressDTO;
import com.finovate.model.PersonAddressData;

public interface IAddressService {

	PersonAddressData createAddressData(AddressDTO addressDTO);

	List<PersonAddressData> getPersonAddressData();

	PersonAddressData getAddresById(int Id);

	PersonAddressData updatePersonAdresssData(int contId, AddressDTO addressDTO);

	void deletPersonAddresssByid(int contId);

	List<PersonAddressData> sortBycityName();

}
