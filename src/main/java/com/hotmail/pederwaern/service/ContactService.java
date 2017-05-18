package com.hotmail.pederwaern.service;

import com.hotmail.pederwaern.domain.Contact;
import com.hotmail.pederwaern.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    public Contact getContact(Long id) {
        return contactRepository.findOne(id);
    }

    public void addContact (Contact contact) {
        contactRepository.save(contact);
    }

    public void deleteContact (Long id) {
        contactRepository.delete(id);
    }

    public void updateContact (Contact contact) {
        contactRepository.save(contact);
    }

}
