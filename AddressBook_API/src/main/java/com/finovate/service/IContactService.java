package com.finovate.service;

import com.finovate.dto.ContactDTO;
import com.finovate.model.PersonContactData;

public interface IContactService {
	PersonContactData createPersonData(ContactDTO contctDTO);
}
