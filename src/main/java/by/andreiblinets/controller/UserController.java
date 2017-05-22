package by.andreiblinets.controller;


import by.andreiblinets.DTO.InformationAboutUser;
import by.andreiblinets.DTO.UserRegistration;
import by.andreiblinets.constant.UserConstant;
import by.andreiblinets.entity.User;
import by.andreiblinets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping (value = UserConstant.REGISTRATION, method = RequestMethod.POST)
    @ResponseBody
    public String registration(@RequestBody UserRegistration user)
    {
        return service.save(user);
    }

    @RequestMapping (value = UserConstant.INFORMATION_ABOU_USER, method = RequestMethod.GET)
    public HashMap<String,InformationAboutUser> getInformation(@PathVariable("token") String token)
    {
        return service.getInformation(token);
    }

    @RequestMapping (value = UserConstant.AUTIFICANTION, method = RequestMethod.GET)
    public HashMap<String,InformationAboutUser> autification
            (@RequestParam("login") String login, @RequestParam("hashpassword") String hashPassword)
    {
        return service.autification(login,hashPassword);
    }

    @RequestMapping (value = UserConstant.CHECKING_LOGIN, method = RequestMethod.GET)
    public boolean chekingLogin(@PathVariable("email") String email)
    {
        return service.checkingEmail(email);
    }

    @RequestMapping (value = UserConstant.CHECKING_PHONE, method = RequestMethod.GET)
    public boolean chekingPhone(@PathVariable("phone") String phone)
    {
        return service.checkingPhone(phone);
    }

    @RequestMapping(value = UserConstant.USERS, method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getReminder(@PathVariable("id") long remindID) {
        return service.getByID(remindID);
    }

   /* @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public User saveRemider(@RequestBody User user) {
        return service.save(user);
    }
*/
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }

}
