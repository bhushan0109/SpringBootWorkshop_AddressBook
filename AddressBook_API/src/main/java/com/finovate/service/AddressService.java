package com.finovate.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Override
	public PersonAddressData getAddresById(int Id) {
		return addressRepository.findById(Id).orElseThrow(() -> new AddressException("details not found!"));
	}

	@Override
	public PersonAddressData updatePersonAdresssData(int contId, AddressDTO addressDTO) {
		PersonAddressData addressData = this.getAddresById(contId);
		addressData.setAddress(addressDTO.address);
		addressData.setCity(addressDTO.city);
		addressData.setState(addressDTO.city);
		addressData.setZipCode(addressDTO.zipCode);
		return addressRepository.save(addressData);
	}

	@Override
	public void deletPersonAddresssByid(int contId) {
		PersonAddressData addressData = this.getAddresById(contId);
		addressRepository.delete(addressData);
	}

}