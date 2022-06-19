package com.fis.sprint_3.repository;

import com.fis.sprint_3.model.AbstracEntity;

import java.util.Optional;

public interface AbstractRepo<T extends AbstracEntity> {
    void create(T obj);

    Optional<T> getALl();

    T findById(Long id);

    T update(T obj);

    void deleteById(Long id);
}
