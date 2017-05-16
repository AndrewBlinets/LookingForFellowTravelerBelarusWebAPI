package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.LastUpdateInformation;
import by.andreiblinets.repository.DateUpdateRepository;
import by.andreiblinets.service.DateUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateUpdateSimple implements DateUpdateService {

    @Autowired
    private DateUpdateRepository dateUpdateRepository;

    public List<LastUpdateInformation> getAll() {
        return dateUpdateRepository.findAll();
    }

    public LastUpdateInformation getByID(long id) {
        return dateUpdateRepository.findOne(id);
    }

    public LastUpdateInformation getByLastUpdate() {
        long lastId = dateUpdateRepository.count();
        LastUpdateInformation obj = dateUpdateRepository.findOne(lastId);
        return obj;
    }

    public LastUpdateInformation save(LastUpdateInformation lastUpdateInformation) {
        return dateUpdateRepository.saveAndFlush(lastUpdateInformation);
    }

    public void remove(long id) {

    }
}
