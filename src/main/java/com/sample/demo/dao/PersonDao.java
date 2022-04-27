package com.sample.demo.dao;

import com.sample.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    //define the contract for anyone the wished to implement the interface
    int insertPerson(UUID id, Person person);

    default  int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
