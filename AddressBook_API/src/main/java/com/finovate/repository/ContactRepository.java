package com.finovate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finovate.model.PersonContactData;

public interface ContactRepository extends JpaRepository<PersonContactData, UUID>{

}
