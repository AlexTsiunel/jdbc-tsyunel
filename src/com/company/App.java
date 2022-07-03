package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.company.dao.ActorDao;
import com.company.dao.CategoryDao;
import com.company.dao.CityDao;
import com.company.dao.FilmDao;
import com.company.entity.ActorEntity;
import com.company.entity.CategoryEntity;
import com.company.entity.CityEntity;
import com.company.entity.FilmEntity;

public class App {
    public static void main(String[] args) throws SQLException {

        try (Connection connection = DriverManager.getConnection(Properties.getUrl(), Properties.getUser(),
                Properties.getPassword());) {

            System.out.println("Task5-------------------------");
            List<FilmEntity> listForTask5 = FilmDao.getFilteredFilmsList(SQLquery.task5, connection);
            listForTask5.forEach(System.out::println);

            System.out.println("Task6-------------------------");
            List<CityEntity> listForTask6 = CityDao.getFilteredCityList(SQLquery.task6, connection);
            listForTask6.forEach(System.out::println);

            System.out.println("Task7-------------------------");
            List<FilmEntity> listForTask7 = FilmDao.getFilteredFilmsList(SQLquery.task7, connection);
            listForTask7.forEach(System.out::println);

            System.out.println("Task8-------------------------");
            List<ActorEntity> listForTask8 = ActorDao.getFilteredActorList(SQLquery.task8, connection);
            listForTask8.forEach(System.out::println);

            System.out.println("Task9-------------------------");
            List<CategoryEntity> listForTask9 = CategoryDao.getFilteredCategoryList(SQLquery.task9, connection);
            listForTask9.forEach(System.out::println);

            System.out.println("Task10------------------------");
            List<ActorEntity> listForTask10 = ActorDao.getFilteredActorList(SQLquery.task10, connection);
            listForTask10.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}