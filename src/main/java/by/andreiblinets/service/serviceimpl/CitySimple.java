package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.City;
import by.andreiblinets.repository.CityRepository;
import by.andreiblinets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitySimple implements CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAll() {
        return cityRepository.findAll();
    }

    public City getByID(long id) {
        return cityRepository.findOne(id);
    }

    public City save(City city) {
        return cityRepository.saveAndFlush(city);
    }

    public void remove(long id) {
        // TO DO
    }
}
