package com.fis.sprint_3.repository.impl;

import com.fis.sprint_3.core.TrackAction;
import com.fis.sprint_3.model.TrackEntry;
import com.fis.sprint_3.repository.TrackEntryRepo;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

public class TrackEntryRepoImpl implements TrackEntryRepo {
    @Override
    public void create(TrackEntry obj) {

    }

    @Override
    public Optional<TrackEntry> getALl() {
        return Optional.empty();
    }

    @Override
    public TrackEntry findById(Long id) {
        return null;
    }

    @Override
    public TrackEntry update(TrackEntry obj) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Set<TrackEntry> findByDetectiveId(Long detectiveId) {
        return null;
    }

    @Override
    public Set<TrackEntry> findByEvidenceId(Long evidenceId) {
        return null;
    }

    @Override
    public Set<TrackEntry> findByDate(Date date) {
        return null;
    }

    @Override
    public Set<TrackEntry> findByDateAndAction(Date date, TrackAction action) {
        return null;
    }
}
