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
import com.company.entity.ActorEntity;

public class ActorDao {
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(Properties.URL, Properties.USER, Properties.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public List<ActorEntity> getFilteredActorList(String SQL) throws SQLException {

        List<ActorEntity> list = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL);
        while (result.next()) {
            list.add(getActorEntityFromDB(result));
        }
        return list;
    }

    private ActorEntity getActorEntityFromDB(ResultSet result) throws SQLException {
        ActorEntity actorEntity = new ActorEntity();
        actorEntity.setId(result.getLong(1));
        actorEntity.setFirstName(result.getString(2));
        actorEntity.setLastName(result.getString(3));
        actorEntity.setLastUpdate(result.getObject(4, OffsetDateTime.class));
        return actorEntity;
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
