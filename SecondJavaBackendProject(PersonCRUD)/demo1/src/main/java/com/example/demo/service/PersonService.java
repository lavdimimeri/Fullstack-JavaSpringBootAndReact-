package com.example.demo.service;

import com.example.demo.dao.PersonDataAccessService;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
   @Autowired
    PersonDataAccessService personDataAccessService;

    public Person getPersonById(int id){
        return personDataAccessService.findById(id).get();

    }

    public List<Person> getAllPeople(){
        List<Person> persons=new ArrayList<Person>();
        personDataAccessService.findAll().forEach(person->persons.add(person));
        return persons;
    }

    public void saveOrUpdate(Person person){
        personDataAccessService.save(person);
    }

}
