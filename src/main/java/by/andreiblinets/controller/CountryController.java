package by.andreiblinets.controller;

import by.andreiblinets.entity.City;
import by.andreiblinets.entity.Country;
import by.andreiblinets.service.CityService;
import by.andreiblinets.service.CountreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountreService service;

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> getCountries()
    {
        return service.getAll();
    }
}
