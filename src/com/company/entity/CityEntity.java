package com.company.entity;

import java.time.OffsetDateTime;
import java.util.Objects;

public class CityEntity {
    private Long id;
    private String city;
    private String country;
    private OffsetDateTime lastUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public OffsetDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(OffsetDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, id, lastUpdate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CityEntity other = (CityEntity) obj;
        return Objects.equals(city, other.city) && Objects.equals(country, other.country)
                && Objects.equals(id, other.id) && Objects.equals(lastUpdate, other.lastUpdate);
    }

    @Override
    public String toString() {
        return "CityEntity [id=" + id + ", city=" + city + ", country=" + country + ", lastUpdate=" + lastUpdate + "]";
    }

}
