/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.celebritylisterbackend.resources;


import com.mycompany.celebritylisterbackend.models.Person;
import com.mycompany.celebritylisterbackend.services.PersonService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author _o0
 */
@Path("/persons")
//getters får Json
@Produces(MediaType.APPLICATION_JSON)
//tar emot Json
@Consumes(MediaType.APPLICATION_JSON)


public class PersonResource {
    
   PersonService personService;

    public PersonResource() {
        personService = new PersonService();
    }
        
    @GET
    public List<Person> getPersons(){
        return personService.getPersons();
    }
    
    @GET
    @Path("/{personId}")
    public Person getPerson(@PathParam("personId") int personId){
        return personService.getPerson(personId);
    }
    
    @POST
    public void addPerson(Person person){
        personService.addPerson(person);
    }
    
    @PUT
    @Path("/{personId}")
    public Person updatePerson(@PathParam("personId") int personId, Person person){
        person.setId(personId);
        return personService.updatePerson(person);
    } 
    
    @DELETE
    @Path("/{personId}")
    public void deletePerson(@PathParam("personId") int personId) {
        personService.deletePerson(personId);
    }
    
    
    
    
   
   
    
}
