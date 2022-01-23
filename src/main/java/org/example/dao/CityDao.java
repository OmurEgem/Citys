package org.example.dao;

import org.example.model.City;
import org.example.model.Country;
import org.example.model.Mayor;

import javax.swing.*;
import java.util.List;

public interface CityDao {

    void findByIdCity(long id);

    void findByIdCoutry(long id);

    void findByIdMayor(long id);

    List<City> getAllCity();

    List<Country> getAllCountry();

    List<Mayor> getAllMayor();

}
