package com.finovate.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.finovate.dto.AddressDTO;
import com.finovate.exception.AddressException;
import com.finovate.model.Address;
import com.finovate.repository.AddressRepository;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address createAddressData(AddressDTO addressDTO) {
		Address addressData = new Address(addressDTO);
		return addressRepository.save(addressData);
	}

	@Override
	public List<Address> getPersonAddressData() {
		return addressRepository.findAll();
	}

	@Override
	public Address updatePersonAdresssData(UUID contId, AddressDTO addressDTO) {
		Address addressData = this.getAddresById(contId);
		addressData.setAddress(addressDTO.address);
		addressData.setCity(addressDTO.city);
		addressData.setState(addressDTO.state);
		addressData.setZipCode(addressDTO.zipCode);
		return addressRepository.save(addressData);
	}

	@Override
	public List<Address> sortBycityName() {
		return addressRepository.findAll((Sort.by("city").ascending()));
	}

	@Override
	public Address getAddresById(UUID Id) {
		Address res = addressRepository.findById(Id)
				.orElseThrow(() -> new AddressException("details not found!"));
		return res;
	}

	@Override
	public void deletPersonAddresssByid(UUID contId) {
		addressRepository.deleteById(contId);
	}

}