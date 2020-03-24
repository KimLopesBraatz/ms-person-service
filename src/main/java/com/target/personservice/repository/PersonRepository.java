package com.target.personservice.repository;

import com.target.personservice.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person getPersonByItin(String itin);
}
