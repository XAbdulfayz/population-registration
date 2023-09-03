package com.xa.populationregistration.controller;

import com.xa.populationregistration.entity.Person;
import com.xa.populationregistration.service.PersonService;
import org.springframework.web.bind.annotation.*;

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



    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable Long id){
        return service.delete(id);
    }




    @PostMapping("create/")
    public Person createByName(@RequestBody Person person){
        return service.create(person);
    }


    @PutMapping("update/")
    public Person update(@RequestBody Person person){
        return service.update(person);
    }
    @GetMapping("find-by-id/{id}")
    public Person findById(@PathVariable Long id){
        return service.findById(id);
    }
}
