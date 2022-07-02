package com.company;

import java.sql.SQLException;
import java.util.List;

import com.company.dao.FilmDao;
import com.company.entity.FilmEntity;

public class App {
    public static void main(String[] args) throws SQLException {
        FilmDao filmDao = new FilmDao();
        List<FilmEntity> list4 = filmDao.getFilteredFilmsList(SQLquery.task5);
        List<FilmEntity> list7 = filmDao.getFilteredFilmsList(SQLquery.task7);
//        list4.forEach(System.out::println);
        list7.forEach(System.out::println);
    }
}