package com.example.listycity;
/**
This class represents a city with a name and province.
The class implements {@link Comparable} to allow sorting by
city name
*/
public class City implements Comparable {
    private String city;
    private String province;
    /**
     * Constructs a City object with the specified name and province.
     *
     * @param city     the name of the city
     * @param province the name of the province the city belongs to
     */
   public City(String city, String province) {
    this.city = city;
    this.province = province;
    }

    /**
     * Gets the name of the city.
     *
     * @return the city name
     */
    String getCityName() {
    return this.city;
    }

    /**
     * Gets the name of the province.
     *
     * @return the province name
     */
    String getProvinceName(){
    return this.province;
    }

    /**
     * Compares this city to another by name for sorting.
     *
     * @param o is another City object
     * @return a negative integer, zero, or a positive integer as this city name
     *         is lexicographically less than, equal to, or greater than the specified city
     */
    @Override
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public int hashCode() {
        return (city + province).hashCode();
    }
}
