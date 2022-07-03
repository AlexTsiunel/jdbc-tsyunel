package com.company.entity;

import java.time.OffsetDateTime;
import java.util.Objects;

public class CategoryEntity {
    private Long id;
    private String name;
    private OffsetDateTime lastUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long categoryId) {
        this.id = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsetDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(OffsetDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastUpdate, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CategoryEntity other = (CategoryEntity) obj;
        return Objects.equals(id, other.id) && Objects.equals(lastUpdate, other.lastUpdate)
                && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "CategoryEntity [categoryId=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
    }

}
