package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.SearchDTO;
import by.andreiblinets.entity.Trip;
import by.andreiblinets.repository.TripRepository;
import by.andreiblinets.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripSimple implements TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> getAll() {
        return null;
    }

    public Trip getByID(long id) {
        return null;
    }

    public Trip save(Trip trip) {
        return null;
    }

    public void remove(long id) {

    }

    public List<Trip> search(SearchDTO searchDTO) {

        return tripRepository.search(searchDTO.getData(),searchDTO.getIdCityOfDeparture(),
                searchDTO.getIdCityOfArrived());
    }
}
