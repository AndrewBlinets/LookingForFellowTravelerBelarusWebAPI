package by.andreiblinets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class Main {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
     @ResponseBody
     public String getReminder(ModelMap model) {
        return "My reminderweb";
           }

}
