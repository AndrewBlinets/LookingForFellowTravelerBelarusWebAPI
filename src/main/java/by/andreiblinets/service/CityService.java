package by.andreiblinets.service;

import by.andreiblinets.DTO.CityDTO;
import by.andreiblinets.entity.City;

import java.util.List;

public interface CityService {

    List<CityDTO> getAll();
    City getByID(long id);
    City save(City city);
    void remove(long id);
}
