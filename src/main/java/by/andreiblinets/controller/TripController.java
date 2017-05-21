package by.andreiblinets.controller;

import by.andreiblinets.DTO.SearchDTO;
import by.andreiblinets.constant.TripConstant;
import by.andreiblinets.entity.Trip;
import by.andreiblinets.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;

    @RequestMapping(value = TripConstant.SEARCH, method = RequestMethod.POST)
    @ResponseBody
    public List<Trip> registration(@RequestBody SearchDTO searchDTO)
    {
        return tripService.search(searchDTO);
    }
}
