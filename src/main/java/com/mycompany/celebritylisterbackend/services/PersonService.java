/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.celebritylisterbackend.services;


import com.mycompany.celebritylisterbackend.models.Person;
import com.mycompany.celebritylisterbackend.repository.PersonRepository;
import java.util.List;

/**
 *
 * @author _o0
 */
public class PersonService {
    
    private PersonRepository personRepository;

    public PersonService() {
        this.personRepository = new PersonRepository();
    }

    public List<Person> getPersons() {
            return personRepository.getPersons();
    }

    public Person getPerson(int id) {
        return personRepository.getPerson(id);
    }

    public void addPerson(Person person) {
        personRepository.addPerson(person);
    }

    public Person updatePerson(Person person) {
        personRepository.updatePerson(person);
        return person;
    }
    
    public void deletePerson(int personId){
        personRepository.deletePerson(personId);
    }
    
    
}
