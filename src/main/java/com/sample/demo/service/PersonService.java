package com.sample.demo.service;

import com.sample.demo.dao.PersonDao;
import com.sample.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("postgress") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonByID(id);
    }

    public int deletePersonByID(UUID id){
        return personDao.deletePersonByID(id);
    }

    public int updatePersonByID(UUID id, Person person){
        return personDao.updatePersonByID(id, person);
    }
}
