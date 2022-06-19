package com.fis.sprint_3.repository;

import com.fis.sprint_3.core.Rank;
import com.fis.sprint_3.model.Detective;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

public interface DetectiveRepo extends AbstractRepo<Detective> {
    Optional<Detective> findByBadgeNumber(String badgeNumber);

    Set<Detective> findByRank(Rank rank);

    Set<Detective> findDetectiveArmed();

    Set<Detective> findDetectiveUnArmed();

    Set<Detective> orderByHiringDate(LocalDateTime from, LocalDateTime to);
}
