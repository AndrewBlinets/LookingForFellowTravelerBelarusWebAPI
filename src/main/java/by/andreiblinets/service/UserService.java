package by.andreiblinets.service;

import by.andreiblinets.DTO.UserDTOAutification;
import by.andreiblinets.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getByID(long id);
    User save(User remind);
    void remove(long id);
    UserDTOAutification autification(String login, String hashPassword);
}
