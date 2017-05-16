package by.andreiblinets.service;

import by.andreiblinets.DTO.InformationAboutUser;
import by.andreiblinets.DTO.UserRegistration;
import by.andreiblinets.entity.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    List<User> getAll();
    User getByID(long id);
    String save(UserRegistration user);
    void remove(long id);
    HashMap<String, InformationAboutUser> autification(String login, String hashPassword);
    HashMap<String, InformationAboutUser> getInformation(String token);
    boolean checkingEmail(String email);
    boolean checkingPhone(String phone);
}
