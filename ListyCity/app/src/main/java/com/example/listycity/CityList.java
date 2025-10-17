package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a list of {@link City} objects.
 * Provides methods to add, check, delete, and count cities in the list.
 */
public class CityList {

    private List<City> cities = new ArrayList<>();
    /**
     * Adds a new city to the list if it does not already exist.
     *
     * @param city the City object to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
    if(cities.contains(city)){
    throw new IllegalArgumentException();
    }
    cities.add(city);
    }
    /**
     * Checks if a city exists in the list.
     *
     * @param city the City object to check
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city from the list if it exists.
     *
     * @param city the City object to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list");
        }
        cities.remove(city);
    }

    /**
     * Returns the total number of cities in the list.
     *
     * @return the count of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted list of cities.
     *
     * @return a sorted {@link List} of cities
     */

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    // hasCity, writeCity, deleteCity

}
