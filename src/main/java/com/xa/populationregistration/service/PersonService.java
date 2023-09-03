package com.xa.populationregistration.service;

import com.xa.populationregistration.dto.PersonCreateDto;
import com.xa.populationregistration.dto.PersonUpdateDto;
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

    public Person create (PersonCreateDto dto) {
        Person person = new Person();
        person.setName(dto.getName());
        person.setAddress(dto.getAddress());
        person.setAge(dto.getAge());
        person.setGender(dto.getGender());

        return repository.save(person);

    }


    public Person update(PersonUpdateDto dto){
        Person person = new Person();
        person.setId(dto.getId());
        person.setName(dto.getName());
        person.setAddress(dto.getAddress());
        person.setAge(dto.getAge());
        person.setGender(dto.getGender());


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
