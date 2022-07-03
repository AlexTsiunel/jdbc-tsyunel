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
    
    public static final String task8 = //
            "SELECT "//
            + "a.actor_id , "//
            + "a.first_name, "//
            + "a.last_name, "//
            + "a.last_update "//
            + "FROM actor a " //
            + "WHERE a.actor_id IN "//
            + "(SELECT fa.actor_id "//
            + "FROM film_actor fa "//
            + "WHERE fa.film_id IN "//
            + "(SELECT f.film_id "//
            + "FROM film f "//
            + "WHERE f.release_year < 1998 "//
            + "AND f.film_id IN "//
            + "(SELECT fc.film_id "//
            + "FROM film_category fc "
            + "WHERE fc.category_id ='7')) "//
            + "GROUP BY fa.actor_id) "//
            + "ORDER BY a.actor_id;";//
    
    public static final String task9 = //
            "SELECT "
            + "c.category_id, "
            + "c.name, "
            + "c.last_update "
            + "FROM category c "
            + "WHERE c.category_id  IN "
            + "(SELECT fc.category_id "
            + "FROM film_category fc "
            + "GROUP BY fc.category_id "
            + "ORDER BY count(*) DESC "
            + "LIMIT (5));";
    
    public static final String task10 = //
            "SELECT "//
            + "a.actor_id, "//
            + "a.first_name, "//
            + "a.last_name, "//
            + "a.last_update "//
            + "FROM actor a "//
            + "WHERE a.actor_id IN "//
            + "(SELECT fa.actor_id "//
            + "FROM film_actor fa "//
            + "GROUP BY fa.actor_id "//
            + "ORDER BY count(*) DESC "//
            + "LIMIT (3));";
}
