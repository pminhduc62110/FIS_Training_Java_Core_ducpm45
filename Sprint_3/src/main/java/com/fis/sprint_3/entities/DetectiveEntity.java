package com.fis.sprint_3.entities;

import com.fis.sprint_3.core.EmploymentStatus;
import com.fis.sprint_3.core.Rank;
import com.fis.sprint_3.model.CriminalCase;
import com.fis.sprint_3.model.Person;
import com.fis.sprint_3.model.TrackEntry;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@Entity
public class DetectiveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detective_id")
    private Long id;
    private Person person;
    private LocalDateTime modifiedAt;
    private String badgeNumber;
    private Rank rank;
    private boolean armed;
    private EmploymentStatus employmentStatus;
    private Set<CriminalCase> criminalCaseSet;
    private Set<TrackEntry> trackEntrySet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public boolean isArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Set<CriminalCase> getCriminalCaseSet() {
        return criminalCaseSet;
    }

    public void setCriminalCaseSet(Set<CriminalCase> criminalCaseSet) {
        this.criminalCaseSet = criminalCaseSet;
    }

    public Set<TrackEntry> getTrackEntrySet() {
        return trackEntrySet;
    }

    public void setTrackEntrySet(Set<TrackEntry> trackEntrySet) {
        this.trackEntrySet = trackEntrySet;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
