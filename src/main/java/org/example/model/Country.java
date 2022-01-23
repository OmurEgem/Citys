package org.example.model;

public class Country {
   private int id;
   private String country;
   private String country_code;
   private String capital;
   private String spoken_language;
   private int Population;

    public Country() {
    }

    public Country(int id, String country, String country_code, String capital, String spoken_language, int population) {
        this.id = id;
        this.country = country;
        this.country_code = country_code;
        this.capital = capital;
        this.spoken_language = spoken_language;
        Population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getSpoken_language() {
        return spoken_language;
    }

    public void setSpoken_language(String spoken_language) {
        this.spoken_language = spoken_language;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "\n" +
                "  id: " + id +
                "  country: " + country  +
                "  country_code: " + country_code  +
                "  capital: " + capital  +
                "  spoken_language='" + spoken_language  +
                "  Population=" + Population ;
    }
}