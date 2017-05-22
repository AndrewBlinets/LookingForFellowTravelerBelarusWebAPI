package by.andreiblinets.controller;

import by.andreiblinets.DTO.SearchDTO;
import by.andreiblinets.DTO.TripDTO;
import by.andreiblinets.constant.TripConstant;
import by.andreiblinets.entity.Trip;
import by.andreiblinets.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;

    @RequestMapping(value = TripConstant.SEARCH, method = RequestMethod.GET)
    @ResponseBody
    public List<Trip> search(@RequestParam("idCityOfDeparture") int idCityOfDeparture,
                             @RequestParam("idCityOfArrived") int idCityOfArrived,
                             @RequestParam("data") String data)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = null;
        try {
            date = dateFormat.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SearchDTO searchDTO = new SearchDTO();
        String[] strings = data.split(".");
        searchDTO.setData(date);
        searchDTO.setIdCityOfArrived(idCityOfArrived);
        searchDTO.setIdCityOfDeparture(idCityOfDeparture);
        return tripService.search(searchDTO);
    }

    @RequestMapping(value = TripConstant.ADD_TRIP, method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody TripDTO tripDTO)
    {
        return (tripService.save(tripDTO)).toString();
    }
}
