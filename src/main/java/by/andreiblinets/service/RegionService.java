package by.andreiblinets.service;

import by.andreiblinets.entity.City;
import by.andreiblinets.entity.Region;

import java.util.List;

public interface RegionService {

    List<Region> getAll();
    Region getByID(long id);
    Region save(Region region);
    void remove(long id);
}
