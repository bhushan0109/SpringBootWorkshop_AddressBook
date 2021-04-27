package com.finovate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finovate.dto.AddressDTO;
import com.finovate.model.PersonAddressData;

@Service
public class AddressService implements IAddressService {

	@Override
	public PersonAddressData createAddressData(AddressDTO addressDTO) {
		PersonAddressData addressData = new PersonAddressData(1, addressDTO);
		return addressData;
	}

	@Override
	public List<PersonAddressData> getPersonAddressData() {
		List<PersonAddressData> addressList = new ArrayList<PersonAddressData>();
		addressList.add(new PersonAddressData(1, new AddressDTO("plot no12", "shimla", "delhi", 234567)));
		return addressList;
	}

	@Override
	public PersonAddressData getAddresById(int Id) {

		PersonAddressData addressData = new PersonAddressData(1, new AddressDTO("plot no14", "mumbai", "mh", 567866));
		return addressData;

	}
}