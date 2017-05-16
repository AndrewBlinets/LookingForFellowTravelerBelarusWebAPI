package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.InformationAboutUser;
import by.andreiblinets.entity.User;
import by.andreiblinets.repository.AccountRepository;
import by.andreiblinets.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by Андрей on 28.04.2017.
 */
public class AccountSimple implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Map<String, InformationAboutUser> autification(String login, String hashPassword) {
        return null;
    }

    public boolean checkingEmailAndPhone(String email, String phone) {
        User user = null;// userRepository.checkingEmailAndPhone(email,phone);
        if (user == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
