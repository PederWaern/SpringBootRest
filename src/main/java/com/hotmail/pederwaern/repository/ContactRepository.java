package com.hotmail.pederwaern.repository;

import com.hotmail.pederwaern.domain.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
