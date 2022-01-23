package org.example.model;

import java.util.Date;

public class Mayor {
   private int id;
   private String mayor;
   private String last_name;
   private String city;
   private String website;
   private Date Took_office;



    public Mayor() {
    }


    public Mayor(int id, String mayor, String last_name, String city, String website, Date took_office) {
        this.id = id;
        this.mayor = mayor;
        this.last_name = last_name;
        this.city = city;
        this.website = website;
        Took_office = took_office;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getTook_office() {
        return Took_office;
    }

    public void setTook_office(Date took_office) {
        Took_office = took_office;
    }

    @Override
    public String toString() {
        return "\n " +
                "  id: " + id +
                "  mayor='" + mayor  +
                "  last_name='" + last_name  +
                "  city='" + city  +
                "  website='" + website  +
                "  Took_office=" + Took_office ;
    }
}
