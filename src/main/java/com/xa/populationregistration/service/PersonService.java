package com.xa.populationregistration.service;

import com.xa.populationregistration.entity.Person;
import com.xa.populationregistration.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService{

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }



    public Person findByName(String name){
        return repository.findByName(name);
    }



    public Person findById(Long id) {
        Optional<Person> result = repository.findById(id);
        return result.get();


    }

}
