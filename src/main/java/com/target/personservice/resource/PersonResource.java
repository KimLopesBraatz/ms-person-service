package com.target.personservice.resource;

import com.target.personservice.domain.Person;
import com.target.personservice.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/person")
public class PersonResource {

    private PersonService service;

    @GetMapping("/itin/{itin}")
    public ResponseEntity<Person> getPersonByItin(@PathVariable String itin) {
        return new ResponseEntity<>(service.getPersonByItin(itin), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Person> postPerson(@Valid @RequestBody Person person) {
        return new ResponseEntity<>(service.save(person), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getPersonList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
