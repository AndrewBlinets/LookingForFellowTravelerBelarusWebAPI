package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.DateUpdateCity;
import by.andreiblinets.repository.DateUpdateRepository;
import by.andreiblinets.service.DateUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateUpdateSimple implements DateUpdateService {

    @Autowired
    private DateUpdateRepository dateUpdateRepository;

    public List<DateUpdateCity> getAll() {
        return dateUpdateRepository.findAll();
    }

    public DateUpdateCity getByID(long id) {
        return dateUpdateRepository.findOne(id);
    }

    public DateUpdateCity getByLastUpdate() {
        long lastId = dateUpdateRepository.count();
        return dateUpdateRepository.findOne(lastId);
    }

    public DateUpdateCity save(DateUpdateCity dateUpdateCity) {
        return dateUpdateRepository.saveAndFlush(dateUpdateCity);
    }

    public void remove(long id) {

    }
}
