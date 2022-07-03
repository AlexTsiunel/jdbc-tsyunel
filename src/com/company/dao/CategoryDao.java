package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.company.entity.CategoryEntity;

public class CategoryDao {

    public static List<CategoryEntity> getFilteredCategoryList(String SQL, Connection connection) throws SQLException {

        List<CategoryEntity> list = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL);
        while (result.next()) {
            list.add(getCategoryFromDB(result));
        }
        return list;
    }

    private static CategoryEntity getCategoryFromDB(ResultSet result) throws SQLException {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(result.getLong(1));
        categoryEntity.setName(result.getString(2));
        categoryEntity.setLastUpdate(result.getObject(3, OffsetDateTime.class));
        return categoryEntity;
    }
}
