package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.company.entity.CityEntity;

public class CityDao {
    public static List<CityEntity> getFilteredCityList(String SQL, Connection connection) throws SQLException {

        List<CityEntity> list = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL);
        while (result.next()) {
            list.add(getCityEntityFromDB(result));
        }

        return list;
    }

    private static CityEntity getCityEntityFromDB(ResultSet result) throws SQLException {
        CityEntity cityEntity = new CityEntity();
        cityEntity.setId(result.getLong(1));
        cityEntity.setCity(result.getString(2));
        cityEntity.setCountry(result.getString(3));
        cityEntity.setLastUpdate(result.getObject(4, OffsetDateTime.class));
        return cityEntity;
    }
}
