package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.Country;
import by.andreiblinets.repository.CountryRepository;
import by.andreiblinets.service.CountreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountrySimple implements CountreService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    public Country getByID(long id) {
        return countryRepository.findOne(id);
    }

    public Country save(Country country) {
        return countryRepository.saveAndFlush(country);
    }

    public void remove(long id) {

    }
}
