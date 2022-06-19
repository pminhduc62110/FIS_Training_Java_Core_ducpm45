package com.fis.sprint_3.repository.impl;

import com.fis.sprint_3.model.Person;
import com.fis.sprint_3.repository.PersonRepo;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

public class PersonRepoImpl implements PersonRepo {
    @Override
    public void create(Person obj) {

    }

    @Override
    public Optional<Person> getALl() {
        return Optional.empty();
    }

    @Override
    public Person findById(Long id) {
        return null;
    }

    @Override
    public Person update(Person obj) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<Person> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Set<Person> findByUsernamePart(String usernamePart) {
        return null;
    }

    @Override
    public Set<Person> findPersonCreatedByDate(LocalDateTime from, LocalDateTime to) {
        return null;
    }
}
