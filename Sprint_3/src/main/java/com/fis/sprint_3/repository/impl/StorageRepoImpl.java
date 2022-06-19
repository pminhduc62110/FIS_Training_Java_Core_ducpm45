package com.fis.sprint_3.repository.impl;

import com.fis.sprint_3.model.Storage;
import com.fis.sprint_3.repository.StorageRepo;

import java.util.Optional;
import java.util.Set;

public class StorageRepoImpl implements StorageRepo {
    @Override
    public void create(Storage obj) {

    }

    @Override
    public Optional<Storage> getALl() {
        return Optional.empty();
    }

    @Override
    public Storage findById(Long id) {
        return null;
    }

    @Override
    public Storage update(Storage obj) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<Storage> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Set<Storage> findByLocation(String location) {
        return null;
    }
}
