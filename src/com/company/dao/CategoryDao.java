package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.company.Properties;
import com.company.entity.CategoryEntity;

public class CategoryDao {
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(Properties.URL, Properties.USER, Properties.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public List<CategoryEntity> getFilteredCategoryList(String SQL) throws SQLException {

        List<CategoryEntity> list = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL);
        while (result.next()) {
            list.add(getCategoryFromDB(result));
        }
        return list;
    }

    private CategoryEntity getCategoryFromDB(ResultSet result) throws SQLException {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(result.getLong(1));
        categoryEntity.setName(result.getString(2));
        categoryEntity.setLastUpdate(result.getObject(3, OffsetDateTime.class));
        return categoryEntity;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
