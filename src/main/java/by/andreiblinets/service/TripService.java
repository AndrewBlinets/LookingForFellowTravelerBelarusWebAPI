package by.andreiblinets.service;

import by.andreiblinets.DTO.SearchDTO;
import by.andreiblinets.DTO.TripDTO;
import by.andreiblinets.entity.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TripService {
    List<Trip> getAll();
    Trip getByID(long id);
    Trip save(TripDTO tripDTO);
    void remove(long id);
    List<Trip> search(SearchDTO searchDTO);
}
