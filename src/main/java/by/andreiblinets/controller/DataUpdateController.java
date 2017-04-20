package by.andreiblinets.controller;

import by.andreiblinets.entity.DateUpdateInformation;
import by.andreiblinets.service.DateUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataUpdateController {

    @Autowired
    private DateUpdateService service;

    @RequestMapping(value = "/lastdataupdate", method = RequestMethod.GET)
    @ResponseBody
    public DateUpdateInformation getLastDateUpdate()
    {
        return service.getByLastUpdate();
    }
}
