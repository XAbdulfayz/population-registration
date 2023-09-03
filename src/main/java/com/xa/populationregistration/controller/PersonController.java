package com.xa.populationregistration.controller;

import com.xa.populationregistration.entity.Person;
import com.xa.populationregistration.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person/")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }


    @GetMapping("find-by-name/{name}")
    public Person findByName(@PathVariable String name){
        return service.findByName(name);
    }

}
