package by.andreiblinets.controller;

import by.andreiblinets.DTO.RegionDTO;
import by.andreiblinets.constant.RegionConstant;
import by.andreiblinets.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController {

    @Autowired
    private RegionService service;

    @RequestMapping(value = RegionConstant.REGIONS, method = RequestMethod.GET)
    @ResponseBody
    public List<RegionDTO> getRegions()
    {
        return service.getAll();
    }

}
