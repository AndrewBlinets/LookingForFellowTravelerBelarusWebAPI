package by.andreiblinets.service;

import by.andreiblinets.entity.DateUpdateCity;

import java.util.List;

public interface DateUpdateService {

    List<DateUpdateCity> getAll();
    DateUpdateCity getByID(long id);
    DateUpdateCity getByLastUpdate();
    DateUpdateCity save(DateUpdateCity dateUpdateCity);
    void remove(long id);
}
