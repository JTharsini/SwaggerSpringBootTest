package com.jeya.swaggerSpringBootTest.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.jeya.swaggerSpringBootTest.models.Contact;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressBookResource
{
  ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();

  @GetMapping("/{id}")
  @ApiOperation(value = "Find Contacts by id",
    notes = "Provide an id to look up specific contact from the address book",
    response = Contact.class)
  public Contact getContact(
    @ApiParam(value = "ID value for the contact you need to retrieve", required = true) @PathVariable String id)
  {
    return contacts.get(id);
  }

  @GetMapping("/")
  public List<Contact> getAllContacts()
  {
    return new ArrayList<>(contacts.values());
  }

  @PostMapping("/")
  public Contact addContact(@RequestBody Contact contact)
  {
    contacts.put(contact.getId(), contact);
    return contact;
  }
}
