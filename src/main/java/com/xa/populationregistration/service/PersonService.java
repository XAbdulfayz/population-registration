package com.xa.populationregistration.service;

import com.xa.populationregistration.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService{

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }
}
