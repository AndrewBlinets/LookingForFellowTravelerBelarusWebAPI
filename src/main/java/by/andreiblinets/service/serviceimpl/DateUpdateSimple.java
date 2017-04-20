package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.DateUpdateInformation;
import by.andreiblinets.repository.DateUpdateRepository;
import by.andreiblinets.service.DateUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateUpdateSimple implements DateUpdateService {

    @Autowired
    private DateUpdateRepository dateUpdateRepository;

    public List<DateUpdateInformation> getAll() {
        return dateUpdateRepository.findAll();
    }

    public DateUpdateInformation getByID(long id) {
        return dateUpdateRepository.findOne(id);
    }

    public DateUpdateInformation getByLastUpdate() {
        long lastId = dateUpdateRepository.count();
        DateUpdateInformation obj = dateUpdateRepository.findOne(lastId);
        return obj;
    }

    public DateUpdateInformation save(DateUpdateInformation dateUpdateInformation) {
        return dateUpdateRepository.saveAndFlush(dateUpdateInformation);
    }

    public void remove(long id) {

    }
}
