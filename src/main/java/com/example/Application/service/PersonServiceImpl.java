package com.example.Application.service;

import com.example.Application.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService{
    private final List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> getAllPersons() {
        return personList;
    }

    @Override
    public Person getPersonById(Long id) {
        return personList.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid person Id:" + id));
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public void updatePerson(Long id, Person personDetails) {
        Person person = getPersonById(id);
        person.setName(personDetails.getName());
        person.setEmail(personDetails.getEmail());
    }

    @Override
    public void deletePerson(Long id) {
        personList.removeIf(person -> person.getId().equals(id));
    }
}
