package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.SearchDTO;
import by.andreiblinets.DTO.TripDTO;
import by.andreiblinets.entity.Team;
import by.andreiblinets.entity.TokenUser;
import by.andreiblinets.entity.Trip;
import by.andreiblinets.entity.enums.TeamStatus;
import by.andreiblinets.repository.*;
import by.andreiblinets.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripSimple implements TripService {

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Trip> getAll() {
        return null;
    }

    public Trip getByID(long id) {
        return null;
    }

    public Trip save(TripDTO tripDTO) {
        Trip trip = tripRepository.save(new Trip(cityRepository.findOne(tripDTO.getCityidOfDeparture()),
                cityRepository.findOne(tripDTO.getCityIdOfArrived()),tripDTO.getDataOfDeparture(),
                tripDTO.getTimeOfDeparture(),tripDTO.getCompensation(),1,tripDTO.getCountFree(),tripDTO.getInformation(),
                tripDTO.getDepartureDevialton(),true));
        TokenUser tokenUser = tokenRepository.findByToken(tripDTO.getTokenUser());
        teamRepository.save(new Team(userRepository.findOne(tokenUser.getId()),
                trip, String.valueOf(TeamStatus.MAINUSER)));
        return null;
    }

    public void remove(long id) {

    }

    public List<Trip> search(SearchDTO searchDTO) {
        List<Trip> list =tripRepository.search(searchDTO.getData(),cityRepository.findOne(searchDTO.getIdCityOfDeparture()),
                cityRepository.findOne(searchDTO.getIdCityOfArrived()));
        return list;
    }
}
