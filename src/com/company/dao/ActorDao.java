package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.company.entity.ActorEntity;

public class ActorDao {
    public static List<ActorEntity> getFilteredActorList(String SQL, Connection connection) throws SQLException {

        List<ActorEntity> list = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL);
        while (result.next()) {
            list.add(getActorEntityFromDB(result));
        }
        return list;
    }

    private static ActorEntity getActorEntityFromDB(ResultSet result) throws SQLException {
        ActorEntity actorEntity = new ActorEntity();
        actorEntity.setId(result.getLong(1));
        actorEntity.setFirstName(result.getString(2));
        actorEntity.setLastName(result.getString(3));
        actorEntity.setLastUpdate(result.getObject(4, OffsetDateTime.class));
        return actorEntity;
    }
}
