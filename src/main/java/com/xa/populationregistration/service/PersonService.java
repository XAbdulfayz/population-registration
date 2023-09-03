package com.xa.populationregistration.service;

import com.xa.populationregistration.entity.Person;
import com.xa.populationregistration.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }



    public String delete(Long id) {
        try {
            repository.deleteById(id);
            return "Successfully deleted: "+id;
        } catch (Exception e) {
            return "ERROR";
        }

    }

    public Person create (Person person) {
        return repository.save(person);

    }


    public Person update(Person person){
        return repository.save(person);
    }


    public Person findByName(String name){
        return repository.findByName(name);
    }



    public Person findById(Long id) {
        Optional<Person> result = repository.findById(id);
        return result.get();


    }
}
