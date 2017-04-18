package by.andreiblinets.service;

import by.andreiblinets.entity.City;

import java.util.List;

public interface CityService {

    List<City> getAll();
    City getByID(long id);
    City save(City city);
    void remove(long id);
}
