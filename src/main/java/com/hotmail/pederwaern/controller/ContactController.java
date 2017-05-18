package com.hotmail.pederwaern.controller;

import com.hotmail.pederwaern.domain.Contact;
import com.hotmail.pederwaern.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactService.getContacts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts/{id}")
    public Contact getContact(@PathVariable Long id) {
        return contactService.getContact(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/contacts")
    public void addTopic(@RequestBody Contact contact){
        contactService.addContact(contact);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/contacts/{id}")
    public void deleteTopic(@PathVariable Long id) {
        contactService.deleteContact(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "/contacts/{id}")
    public void updateContact(@PathVariable Long id, @RequestBody Contact contact) {
        contactService.updateContact(contact);
    }


}
