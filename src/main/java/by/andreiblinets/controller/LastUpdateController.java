package by.andreiblinets.controller;

import by.andreiblinets.constant.LastUpdateInformationConstant;
import by.andreiblinets.entity.LastUpdateInformation;
import by.andreiblinets.service.DateUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LastUpdateController {

    @Autowired
    private DateUpdateService service;

    @RequestMapping(value = LastUpdateInformationConstant.DATA_UPDATE, method = RequestMethod.GET)
    @ResponseBody
    public LastUpdateInformation getLastDateUpdate()
    {
        return service.getByLastUpdate();
    }
}
