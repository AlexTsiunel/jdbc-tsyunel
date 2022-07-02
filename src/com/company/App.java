package com.company;

import java.sql.SQLException;
import java.util.List;

import com.company.dao.CityDao;
import com.company.dao.FilmDao;
import com.company.entity.CityEntity;
import com.company.entity.FilmEntity;

public class App {
    public static void main(String[] args) throws SQLException {
        FilmDao filmDao = new FilmDao();
        List<FilmEntity> listForTask5 = filmDao.getFilteredFilmsList(SQLquery.task5);
        List<FilmEntity> listForTask7 = filmDao.getFilteredFilmsList(SQLquery.task7);
        filmDao.close();
        listForTask5.forEach(System.out::println);
        System.out.println("-------------------------");
        listForTask7.forEach(System.out::println);
        System.out.println("-------------------------");
       
        CityDao cityDao = new CityDao();
        List<CityEntity>listForTask6 = cityDao.getFilteredCityList(SQLquery.task6);
        cityDao.close();
        listForTask6.forEach(System.out::println);
        System.out.println("-------------------------");
    }
}