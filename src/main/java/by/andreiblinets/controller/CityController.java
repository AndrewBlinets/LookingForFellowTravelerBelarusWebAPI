package by.andreiblinets.controller;

import by.andreiblinets.entity.City;
import by.andreiblinets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService service;

    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    @ResponseBody
    public List<City> getCity()
    {
        return service.getAll();
    }

}
