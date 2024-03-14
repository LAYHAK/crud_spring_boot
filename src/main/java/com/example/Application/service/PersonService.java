package com.example.Application.service;

import com.example.Application.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
    Person getPersonById(Long id);
    void addPerson(Person person);
    void updatePerson(Long id, Person personDetails);
    void deletePerson(Long id);
}
