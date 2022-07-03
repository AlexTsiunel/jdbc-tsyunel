package com.company.entity;

import java.time.OffsetDateTime;
import java.util.Objects;

public class FilmEntity {

    private Long id;
    private String title;
    private String description;
    private Integer year;
    private Integer languageId;
    private Integer originalLanguageId;
    private Integer rentalDuration;
    private Double rentalRate;
    private Integer length;
    private Double replacementCost;
    private RatingMPAA rating;
    private OffsetDateTime lastUpdate;
    private String specialFeatures;
    private String tsvector;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Double rental_rate) {
        this.rentalRate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(Double replacement_cost) {
        this.replacementCost = replacement_cost;
    }

    public RatingMPAA getRating() {
        return rating;
    }

    public void setRating(RatingMPAA rating) {
        this.rating = rating;
    }

    public OffsetDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(OffsetDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getTsvector() {
        return tsvector;
    }

    public void setTsvector(String tsvector) {
        this.tsvector = tsvector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, languageId, lastUpdate, length, originalLanguageId, rating, rentalDuration,
                rentalRate, replacementCost, specialFeatures, title, tsvector, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FilmEntity other = (FilmEntity) obj;
        return Objects.equals(description, other.description) && Objects.equals(id, other.id)
                && Objects.equals(languageId, other.languageId) && Objects.equals(lastUpdate, other.lastUpdate)
                && Objects.equals(length, other.length) && Objects.equals(originalLanguageId, other.originalLanguageId)
                && rating == other.rating && Objects.equals(rentalDuration, other.rentalDuration)
                && Objects.equals(rentalRate, other.rentalRate)
                && Objects.equals(replacementCost, other.replacementCost)
                && Objects.equals(specialFeatures, other.specialFeatures) && Objects.equals(title, other.title)
                && Objects.equals(tsvector, other.tsvector) && Objects.equals(year, other.year);
    }

    @Override
    public String toString() {
        return "Film [id=" + id + ", title=" + title + ", description=" + description + ", year=" + year
                + ", languageId=" + languageId + ", originalLanguageId=" + originalLanguageId + ", rentalDuration="
                + rentalDuration + ", rental_rate=" + rentalRate + ", length=" + length + ", replacement_cost="
                + replacementCost + ", lastUpdate=" + lastUpdate + ", specialFeatures=" + specialFeatures
                + ", tsvector=" + tsvector + "]";
    }

    public enum RatingMPAA {
        G, //
        PG, //
        PG13, //
        R, //
        NC17//
    }
}
