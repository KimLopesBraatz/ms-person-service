package com.target.personservice.service;

import com.target.personservice.domain.Person;
import com.target.personservice.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonRepository repository;

    public Person save(Person person) {
        person.setCreatedIn(new Date());
        return repository.save(person);
    }

    public Person getPersonByItin(String itin) {
        return repository.getPersonByItin(itin);
    }
}
