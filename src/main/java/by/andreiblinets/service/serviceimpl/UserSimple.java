package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.UserDTOAutification;
import by.andreiblinets.entity.User;
import by.andreiblinets.repository.UserReposiroty;
import by.andreiblinets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSimple implements UserService {

    @Autowired
    private UserReposiroty userReposiroty;

    public List<User> getAll() {
        return null;
    }

    public User getByID(long id) {
        return null;
    }

    public User save(User remind) {
        return null;
    }

    public void remove(long id) {

    }

    public UserDTOAutification autification(String login, String hashPassword) {
        return null;
    }
}
