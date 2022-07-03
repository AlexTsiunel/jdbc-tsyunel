package com.company;

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
        FilmDao filmDao = new FilmDao();
        CityDao cityDao = new CityDao();
        ActorDao actorDao = new ActorDao();
        CategoryDao categoryDao = new CategoryDao();
        
        System.out.println("Task5-------------------------");
        List<FilmEntity> listForTask5 = filmDao.getFilteredFilmsList(SQLquery.task5);
        listForTask5.forEach(System.out::println);
        
        System.out.println("Task6-------------------------");
        List<CityEntity>listForTask6 = cityDao.getFilteredCityList(SQLquery.task6);
        listForTask6.forEach(System.out::println);
        
        System.out.println("Task7-------------------------");
        List<FilmEntity> listForTask7 = filmDao.getFilteredFilmsList(SQLquery.task7);
        listForTask7.forEach(System.out::println);
        
        System.out.println("Task8-------------------------");
        List<ActorEntity> listForTask8 = actorDao.getFilteredActorList(SQLquery.task8);
        listForTask8.forEach(System.out::println);
        
        System.out.println("Task9-------------------------");
        List<CategoryEntity> listForTask9 = categoryDao.getFilteredCategoryList(SQLquery.task9);
        listForTask9.forEach(System.out::println);
        
        System.out.println("Task10------------------------");
        List<ActorEntity> listForTask10 = actorDao.getFilteredActorList(SQLquery.task10);
        listForTask10.forEach(System.out::println);
        
        filmDao.close();
        actorDao.close();
        cityDao.close();
        categoryDao.close();
    }
}