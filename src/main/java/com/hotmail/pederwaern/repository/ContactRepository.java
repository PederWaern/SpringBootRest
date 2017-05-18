package com.hotmail.pederwaern.repository;

import com.hotmail.pederwaern.domain.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Long> {

    List<Contact> findContactsByFirstName(String firstName);
}
