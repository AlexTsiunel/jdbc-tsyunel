package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.company.entity.FilmEntity;
import com.company.entity.FilmEntity.RatingMPAA;

public class FilmDao {
    public static List<FilmEntity> getFilteredFilmsList(String SQL, Connection connection) throws SQLException {

        List<FilmEntity> list = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL);
        while (result.next()) {
            list.add(getFilmEntityFromDB(result));
        }
        return list;
    }

    private static FilmEntity getFilmEntityFromDB(ResultSet result) throws SQLException {
        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setId(result.getLong(1));
        filmEntity.setTitle(result.getString(2));
        filmEntity.setDescription(result.getString(3));
        filmEntity.setYear(result.getInt(4));
        filmEntity.setLanguageId(result.getInt(5));
        filmEntity.setOriginalLanguageId(result.getInt(6));
        filmEntity.setRentalDuration(result.getInt(7));
        filmEntity.setRentalRate(result.getDouble(8));
        filmEntity.setLength(result.getInt(9));
        filmEntity.setReplacementCost(result.getDouble(10));
        filmEntity.setRating(formatStringToMPPA(result.getString(11)));
        filmEntity.setLastUpdate(result.getObject(12, OffsetDateTime.class));
        filmEntity.setSpecialFeatures(result.getString(13));
        return filmEntity;
    }
    
    private static RatingMPAA formatStringToMPPA(String str) {
        RatingMPAA rating = null;
        switch (str) {
        case "G":
            rating = RatingMPAA.G;
            break;
        case "PG":
            rating = RatingMPAA.PG;
            break;
        case "PG13":
            rating = RatingMPAA.PG13;
            break;
        case "R":
            rating = RatingMPAA.R;
            break;
        case "NC17":
            rating = RatingMPAA.NC17;
            break;
        }
        return rating;
    }
}
