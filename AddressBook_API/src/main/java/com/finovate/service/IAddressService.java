package com.finovate.service;

import com.finovate.dto.AddressDTO;
import com.finovate.model.PersonAddressData;

public interface IAddressService {

	PersonAddressData createAddressData(AddressDTO addressDTO);

}
