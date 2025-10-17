package com.example.listycity;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta"); 
        }


@Test
void testAdd() {
    CityList cityList = mockCityList();
    assertEquals(1, cityList.getCities().size());
    City city = new City("Regina", "Saskatchewan");
    cityList.add(city);
    assertEquals(2, cityList.getCities().size());
    assertTrue(cityList.getCities().contains(city));
}


@Test
void testAddException() {
    CityList cityList = mockCityList();
    City city = new City("Yellowknife", "Northwest Territories");
}

@Test
void testGetCities() {
CityList cityList = mockCityList();
assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
City city = new City("Charlottetown", "Prince Edward Island");
cityList.add(city);
assertEquals(0, city.compareTo(cityList.getCities().get(0)));
assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
}

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        assertTrue(cityList.hasCity(edmonton));
        assertFalse(cityList.hasCity(calgary));
    }

    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();
        City city = mockCity();

        assertTrue(cityList.hasCity(city));
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteThrowsException() {
        CityList cityList = new CityList();
        City city = new City("Vancouver", "British Columbia");

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

    @Test
    void testCountCities() {
        CityList cityList = new CityList();
        assertEquals(0, cityList.countCities());

        cityList.add(new City("Toronto", "Ontario"));
        cityList.add(new City("Ottawa", "Ontario"));
        assertEquals(2, cityList.countCities());
    }
}

}

