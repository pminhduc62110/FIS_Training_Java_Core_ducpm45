package com.fis.sprint_3.repository.impl;

import com.fis.sprint_3.core.CaseStatus;
import com.fis.sprint_3.core.CaseType;
import com.fis.sprint_3.model.CriminalCase;
import com.fis.sprint_3.model.Detective;
import com.fis.sprint_3.repository.CriminalCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.Optional;
import java.util.Set;

public class CriminalCaseRepoImpl implements CriminalCaseRepo {
    @Autowired
    private EntityManager em;

    @Override
    public void create(CriminalCase obj) {

    }

    @Override
    public Optional<CriminalCase> getALl() {
        return Optional.empty();
    }

    @Override
    public CriminalCase findById(Long id) {
        return null;
    }

    @Override
    public CriminalCase update(CriminalCase obj) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<CriminalCase> findByNumber(String caseNumber) {
        return Optional.empty();
    }

    @Override
    public Set<CriminalCase> findByLeadInvestigator(Detective detective) {
        return null;
    }

    @Override
    public Set<CriminalCase> findByStatus(CaseStatus status) {
        return null;
    }

    @Override
    public Set<CriminalCase> findByType(CaseType type) {
        return null;
    }
}
