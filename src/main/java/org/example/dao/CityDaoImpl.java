package org.example.dao;

import org.example.model.City;
import org.example.model.Country;
import org.example.model.Mayor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.util.Util.connect;

public class CityDaoImpl implements CityDao {



    @Override
    public void findByIdCity(long id) {

        try (PreparedStatement preparedStatement = connect().prepareStatement
                ("select * from city where id=(?)")) {
            preparedStatement.setInt(1, (int) id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int Id = rs.getInt("id");
                String city = rs.getString("City");
                String population = rs.getString("population");
                String postal_code = rs.getString("postal_code");
                String distric = rs.getString("distric");
                String area_code = rs.getString("Area_code");

                System.out.println(Id);
                System.out.println(city);
                System.out.println(population);
                System.out.println(postal_code);
                System.out.println(distric);
                System.out.println(area_code);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findByIdCoutry(long id) {



        try (PreparedStatement preparedStatement = connect().prepareStatement
                ("select * from country where id=(?)")) {
            preparedStatement.setInt(1, (int) id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int Id = rs.getInt("id");
                String country = rs.getString("country");
                String country_code = rs.getString("country_code");
                String capital = rs.getString("capital");
                String spoken_language = rs.getString("spoken_language");
                String Population = rs.getString("Population");

                System.out.println(Id);
                System.out.println(country);
                System.out.println(country_code);
                System.out.println(capital);
                System.out.println(spoken_language);
                System.out.println(Population);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



    @Override
    public void findByIdMayor(long id) {


        try (PreparedStatement preparedStatement = connect().prepareStatement
                ("select * from mayor where id=(?)")) {
            preparedStatement.setInt(1, (int) id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int Id = rs.getInt("id");
                String mayor = rs.getString("mayor");
                String last_name = rs.getString("last_name");
                String city = rs.getString("city");
                String website = rs.getString("website");
                String took_office = rs.getString("took_office");

                System.out.println(id);
                System.out.println(mayor);
                System.out.println(last_name);
                System.out.println(city);
                System.out.println(website);
                System.out.println(took_office);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<City> getAllCity() {
        System.out.println("City");
        List<City> city = new ArrayList<>();
        String SQL = "SELECT * FROM city";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                city.add(new City(

                        rs.getInt("id"),
                        rs.getString("City"),
                        rs.getString("population"),
                        rs.getString("postal_code"),
                        rs.getString("distric"),
                        rs.getString("Area_code")));
            }
            return city;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return city;
    }

    @Override
    public List<Country> getAllCountry() {
        System.out.println("Country");
        List<Country> country = new ArrayList<>();
        String SQL = "SELECT * FROM country";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                country.add(new Country(
                        rs.getInt("id"),
                        rs.getString("country"),
                        rs.getString("country_code"),
                        rs.getString("capital"),
                        rs.getString("spoken_language"),
                        rs.getInt("Population")));
            }
            return country;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return country;
    }

    @Override
    public List<Mayor> getAllMayor() {
        System.out.println("Mayor");
        List<Mayor> mayor = new ArrayList<>();
        String SQL = "SELECT * FROM mayor";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                mayor.add(new Mayor(
                        rs.getInt("id"),
                        rs.getString("mayor"),
                        rs.getString("last_name"),
                        rs.getString("city"),
                        rs.getString("website"),
                        rs.getDate("took_office")));
            }
            return mayor;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mayor;
    }
}

