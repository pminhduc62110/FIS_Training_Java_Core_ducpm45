package com.fis.sprint_3.repository.impl;

import com.fis.sprint_3.core.Rank;
import com.fis.sprint_3.model.Detective;
import com.fis.sprint_3.repository.DetectiveRepo;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

public class DetectiveRepoImpl implements DetectiveRepo {
    @Override
    public void create(Detective obj) {

    }

    @Override
    public Optional<Detective> getALl() {
        return Optional.empty();
    }

    @Override
    public Detective findById(Long id) {
        return null;
    }

    @Override
    public Detective update(Detective obj) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<Detective> findByBadgeNumber(String badgeNumber) {
        return Optional.empty();
    }

    @Override
    public Set<Detective> findByRank(Rank rank) {
        return null;
    }

    @Override
    public Set<Detective> findDetectiveArmed() {
        return null;
    }

    @Override
    public Set<Detective> findDetectiveUnArmed() {
        return null;
    }

    @Override
    public Set<Detective> orderByHiringDate(LocalDateTime from, LocalDateTime to) {
        return null;
    }
}
