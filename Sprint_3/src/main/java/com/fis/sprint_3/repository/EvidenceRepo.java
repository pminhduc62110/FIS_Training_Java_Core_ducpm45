package com.fis.sprint_3.repository;

import com.fis.sprint_3.model.CriminalCase;
import com.fis.sprint_3.model.Evidence;

import java.util.Optional;
import java.util.Set;

public interface EvidenceRepo extends AbstractRepo<Evidence> {
    Set<Evidence> findByCriminalCase(CriminalCase criminalCase);

    Optional<Evidence> findByNumber(String evidenceNumber);

    Set<Evidence> findAllEvidenceArchived();

    Set<Evidence> findAllEvidenceNotYetArchived();
}
