package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.CityDTO;
import by.andreiblinets.entity.City;
import by.andreiblinets.entity.Country;
import by.andreiblinets.entity.Region;
import by.andreiblinets.repository.CityRepository;
import by.andreiblinets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitySimple implements CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<CityDTO> getAll() {
        List<City> cities = cityRepository.findAll();
        List<CityDTO> cityDTOs = new ArrayList<CityDTO>();
        CityDTO cityDTO = null;
       for (City obj : cities) {
            cityDTO = new CityDTO();
            cityDTO.setId(obj.getId());
            cityDTO.setName(obj.getName());
            cityDTO.setIdRegion(obj.getRegion().getId());
            cityDTOs.add(cityDTO);
        }
        return cityDTOs;
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
