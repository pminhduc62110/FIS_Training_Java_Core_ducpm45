package com.fis.sprint_3.entities;

import com.fis.sprint_3.model.CriminalCase;
import com.fis.sprint_3.model.Storage;
import com.fis.sprint_3.model.TrackEntry;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@Entity
@Table(name = "evidences")
public class EvidenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evidence_id")
    private Long id;
    @ColumnDefault("1.0")
    private int version;
    @Temporal(TemporalType.DATE)
    private LocalDateTime createdAt;

    @Temporal(TemporalType.DATE)
    private LocalDateTime modifiedAt;
    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "case_id")
    private CriminalCaseEntity criminalCase;
    private StorageEntity storage;
    private String number;
    private String itemName;
    private String notes;
    private boolean archived;
    private Set<TrackEntryEntity> trackEntrySet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public CriminalCase getCriminalCase() {
        return criminalCase;
    }

    public void setCriminalCase(CriminalCase criminalCase) {
        this.criminalCase = criminalCase;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Set<TrackEntry> getTrackEntrySet() {
        return trackEntrySet;
    }

    public void setTrackEntrySet(Set<TrackEntry> trackEntrySet) {
        this.trackEntrySet = trackEntrySet;
    }
}
