package com.company.entity;

import java.time.OffsetDateTime;
import java.util.Objects;

public class ActorEntity {
    private Long id;
    private String firstName;
    private String lastName;
    private OffsetDateTime lastUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public OffsetDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(OffsetDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, id, lastName, lastUpdate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ActorEntity other = (ActorEntity) obj;
        return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
                && Objects.equals(lastName, other.lastName) && Objects.equals(lastUpdate, other.lastUpdate);
    }

    @Override
    public String toString() {
        return "ActorEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
                + lastUpdate + "]";
    }

}
