package org.example.model;

public class City {
   private int id;
   private String city;
   private String population;
   private String postal_code;
   private String distric;
   private String area_code;

    public City(int id, String city, String population, String postal_code, String distric, String area_code) {
        this.id = id;
        this.city = city;
        this.population = population;
        this.postal_code = postal_code;
        this.distric = distric;
        this.area_code = area_code;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    @Override
    public String toString() {
        return "\n " +
                "  id: " + id +
                "  city: " + city +
                "  population: " + population  +
                "  postal_code: " + postal_code  +
                "  distric: " + distric  +
                "  area_code=: " + area_code  ;
    }
}
