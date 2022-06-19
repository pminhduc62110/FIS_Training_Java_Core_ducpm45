package com.fis.sprint_3.repository;

import com.fis.sprint_3.core.CaseStatus;
import com.fis.sprint_3.core.CaseType;
import com.fis.sprint_3.model.CriminalCase;
import com.fis.sprint_3.model.Detective;

import java.util.Optional;
import java.util.Set;

public interface CriminalCaseRepo extends AbstractRepo<CriminalCase> {
    Optional<CriminalCase> findByNumber(String caseNumber);

    Set<CriminalCase> findByLeadInvestigator(Detective detective);

    Set<CriminalCase> findByStatus(CaseStatus status);

    Set<CriminalCase> findByType(CaseType type);
}
