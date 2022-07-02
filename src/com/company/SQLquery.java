package com.company;

public class SQLquery {
    public static final String task5 = //
            "SELECT "//
                    + "f.film_id,"//
                    + "f.title, " //
                    + "f.description, "//
                    + "f.release_year, " //
                    + "f.language_id, " //
                    + "f.original_language_id, "//
                    + "f.rental_duration, "//
                    + "f.rental_rate, " //
                    + "f.length, " //
                    + "f.replacement_cost, "//
                    + "f.rating, "//
                    + "f.last_update, " //
                    + "f.special_features, " //
                    + "f.fulltext " //
                    + "FROM film f "//
                    + "WHERE f.release_year BETWEEN 2005 AND 2007 " //
                    + "ORDER BY f.length DESC";

    public static final String task6 = //
            "SELECT "//
                    + "ci.city_id," + "ci.city AS city , "//
                    + "co.country AS country, "//
                    + "ci .last_update "//
                    + "FROM city ci "//
                    + "INNER JOIN country co "//
                    + "ON co.country_id = ci.country_id  "//
                    + "ORDER BY country;";

    public static final String task7 = //
            "SELECT "//
                    + "f.film_id,"//
                    + "f.title, " //
                    + "f.description, "//
                    + "f.release_year, " //
                    + "f.language_id, " //
                    + "f.original_language_id, "//
                    + "f.rental_duration, "//
                    + "f.rental_rate, " //
                    + "f.length, " //
                    + "f.replacement_cost, "//
                    + "f.rating, "//
                    + "f.last_update, " //
                    + "f.special_features, " //
                    + "f.fulltext " //
                    + "FROM film f "//
                    + "WHERE f.rating = 'R'  AND f.film_id IN "//
                    + "(SELECT fc.film_id "//
                    + "FROM film_category fc "//
                    + "WHERE fc.category_id = 5)";
}
