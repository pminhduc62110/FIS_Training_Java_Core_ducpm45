package com.fis.sprint_3.repository.impl;

import com.fis.sprint_3.model.CriminalCase;
import com.fis.sprint_3.model.Evidence;
import com.fis.sprint_3.repository.EvidenceRepo;

import java.util.Optional;
import java.util.Set;

public class EvidenceRepoImpl implements EvidenceRepo {
    @Override
    public void create(Evidence obj) {

    }

    @Override
    public Optional<Evidence> getALl() {
        return Optional.empty();
    }

    @Override
    public Evidence findById(Long id) {
        return null;
    }

    @Override
    public Evidence update(Evidence obj) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Set<Evidence> findByCriminalCase(CriminalCase criminalCase) {
        return null;
    }

    @Override
    public Optional<Evidence> findByNumber(String evidenceNumber) {
        return Optional.empty();
    }

    @Override
    public Set<Evidence> findAllEvidenceArchived() {
        return null;
    }

    @Override
    public Set<Evidence> findAllEvidenceNotYetArchived() {
        return null;
    }
}
