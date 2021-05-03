package com.finovate.service;

import java.util.List;
import java.util.UUID;

import com.finovate.dto.AddressDTO;
import com.finovate.model.Address;

public interface IAddressService {

	Address createAddressData(AddressDTO addressDTO);

	List<Address> getPersonAddressData();

	Address getAddresById(UUID Id);
	
	Address updatePersonAdresssData(UUID contId, AddressDTO addressDTO);

	void deletPersonAddresssByid(UUID contId);

	List<Address> sortBycityName();
	
}