/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.celebritylisterbackend.repository;


import com.mycompany.celebritylisterbackend.models.Person;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author _o0
 */
public class PersonRepository {    

    public List<Person> getPersons() {
        Session session = HibernateUtil.getSession();
        List<Person> persons = session.createCriteria(Person.class).list();
        session.close();
        return persons;
    }

    public Person getPerson(int id) {
        Session session = HibernateUtil.getSession();
        Person person = (Person) session.get(Person.class, id);
        session.close();
        return person;
    }

    public void addPerson(Person person) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }

    public void updatePerson(Person updatedPerson) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.update(updatedPerson);
        session.getTransaction().commit();
        session.close();
    }

    public void deletePerson(int personId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            Person persistentInstance = (Person) session.load(Person.class, personId);
            session.delete(persistentInstance);
            session.getTransaction().commit();
        } catch (Exception e) {
        }
        session.close();
    }
    
}
