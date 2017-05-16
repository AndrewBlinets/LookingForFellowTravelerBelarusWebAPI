package by.andreiblinets.controller;

import by.andreiblinets.DTO.CityDTO;
import by.andreiblinets.constant.CityConstant;
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

    @RequestMapping(value = CityConstant.CITIES, method = RequestMethod.GET)
    @ResponseBody
    public List<CityDTO> getCity()
    {
        return service.getAll();
    }

}
