package com.finovate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finovate.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, UUID>{

}
