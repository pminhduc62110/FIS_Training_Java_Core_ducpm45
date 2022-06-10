package core;

import java.time.LocalDateTime;
import java.util.Set;

public class Storage {
    private int id;
    private int version;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String name;
    private String location;
    private Set<Evidence> evidencesSet;

    public Storage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Evidence> getEvidencesSet() {
        return evidencesSet;
    }

    public void setEvidencesSet(Set<Evidence> evidencesSet) {
        this.evidencesSet = evidencesSet;
    }
}
