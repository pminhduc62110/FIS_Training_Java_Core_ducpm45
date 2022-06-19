package com.fis.sprint_3.repository;

import com.fis.sprint_3.model.Person;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

public interface PersonRepo extends AbstractRepo<Person> {
    Optional<Person> findByUsername(String username);

    Set<Person> findByUsernamePart(String usernamePart);

    Set<Person> findPersonCreatedByDate(LocalDateTime from, LocalDateTime to);
}
