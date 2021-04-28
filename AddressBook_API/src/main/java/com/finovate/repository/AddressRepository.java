package com.finovate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finovate.model.PersonAddressData;

public interface AddressRepository extends JpaRepository<PersonAddressData, Integer>{

}
