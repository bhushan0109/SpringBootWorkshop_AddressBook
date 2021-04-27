package com.finovate.service;

import org.springframework.stereotype.Service;

import com.finovate.dto.AddressDTO;
import com.finovate.model.PersonAddressData;

@Service
public class AddressService implements IAddressService {

	@Override
	public PersonAddressData createAddressData(AddressDTO addressDTO) {
		PersonAddressData addressData = new PersonAddressData(1,addressDTO);
		return addressData;
	}

}
