package com.finovate.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.finovate.dto.AddressDTO;
import com.finovate.exception.AddressException;
import com.finovate.model.PersonAddressData;
import com.finovate.repository.AddressRepository;

@Repository
@Service
public class AddressService implements IAddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public PersonAddressData createAddressData(AddressDTO addressDTO) {
		PersonAddressData addressData = new PersonAddressData(addressDTO);
		return addressRepository.save(addressData);
	}

	@Override
	public List<PersonAddressData> getPersonAddressData() {
		return addressRepository.findAll();
	}

	public PersonAddressData updatePersonAdresssData(UUID contId, AddressDTO addressDTO) {
		PersonAddressData addressData = this.getAddresById(contId);
		addressData.setAddress(addressDTO.address);
		addressData.setCity(addressDTO.city);
		addressData.setState(addressDTO.state);
		addressData.setZipCode(addressDTO.zipCode);
		return addressRepository.save(addressData);
	}

	@Override
	public List<PersonAddressData> sortBycityName() {
		return addressRepository.findAll((Sort.by("city").ascending()));
	}

	@Override
	public PersonAddressData getAddresById(UUID Id) {
		PersonAddressData res = addressRepository.findById(Id).orElseThrow(() -> new AddressException("details not found!"));
		return res;
	}

	@Override
	public void deletPersonAddresssByid(UUID contId) {
		addressRepository.deleteById(contId);
	}

}