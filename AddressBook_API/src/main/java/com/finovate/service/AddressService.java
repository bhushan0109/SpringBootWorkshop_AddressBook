package com.finovate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finovate.dto.AddressDTO;
import com.finovate.model.PersonAddressData;

@Service
public class AddressService implements IAddressService {
	private List<PersonAddressData> addressList = new ArrayList<PersonAddressData>();

	@Override
	public PersonAddressData createAddressData(AddressDTO addressDTO) {
		PersonAddressData addressData = null;
		addressData = new PersonAddressData(addressList.size() + 1, addressDTO);
		addressList.add(addressData);
		return addressData;
	}

	@Override
	public List<PersonAddressData> getPersonAddressData() {
		return addressList;
	}

	@Override
	public PersonAddressData getAddresById(int Id) {

		return addressList.get(Id - 1);

	}

	@Override

	public PersonAddressData updatePersonAdresssData(int contId, AddressDTO addressDTO) {
		PersonAddressData addressData = this.getAddresById(contId);
		addressData.setAddress(addressDTO.address);
		addressData.setCity(addressDTO.city);
		addressData.setState(addressDTO.city);
		addressData.setZipCode(addressDTO.zipCode);
		addressList.set(contId - 1, addressData);
		return addressData;
	}

	@Override
	public void deletPersonAddresssByid(int contId) {
		addressList.remove(contId - 1);

	}
}