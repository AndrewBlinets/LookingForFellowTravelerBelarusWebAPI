package by.andreiblinets.service;

import by.andreiblinets.entity.Country;

import java.util.List;

public interface CountreService {

    List<Country> getAll();
    Country getByID(long id);
    Country save(Country country);
    void remove(long id);

}
