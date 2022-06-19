package com.fis.sprint_3.entities;

import com.fis.sprint_3.core.CaseStatus;
import com.fis.sprint_3.core.CaseType;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "criminal_cases")
public class CriminalCaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_id")
    private Long id;
    @ColumnDefault("1.0")
    private int version;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modifiedAt;
    private String number;
    private CaseType caseType;
    private String shortDescription;
    private String detailedDescription;
    private CaseStatus caseStatus;
    private String notes;
    @OneToMany(mappedBy = "criminalCase", cascade = CascadeType.ALL)
    private Set<EvidenceEntity> evidenceSet;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lead_detective_id", referencedColumnName = "detective_id")
    private DetectiveEntity leadInvestigator;
    @ManyToMany
    private Set<DetectiveEntity> assigned;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public CaseStatus getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(CaseStatus caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<EvidenceEntity> getEvidenceSet() {
        return evidenceSet;
    }

    public void setEvidenceSet(Set<EvidenceEntity> evidenceSet) {
        this.evidenceSet = evidenceSet;
    }

    public DetectiveEntity getLeadInvestigator() {
        return leadInvestigator;
    }

    public void setLeadInvestigator(DetectiveEntity leadInvestigator) {
        this.leadInvestigator = leadInvestigator;
    }

    public Set<DetectiveEntity> getAssigned() {
        return assigned;
    }

    public void setAssigned(Set<DetectiveEntity> assigned) {
        this.assigned = assigned;
    }
}
