package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.dayanandPerson;
import com.example.springapp.repository.dayanandPersonRepo;

@Service
public class PersonService {
    public dayanandPersonRepo personRepo;

    public PersonService(dayanandPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(dayanandPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<dayanandPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
