package com.finovate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finovate.model.PersonAddressData;

public interface AddressRepository extends JpaRepository<PersonAddressData, UUID> {

}