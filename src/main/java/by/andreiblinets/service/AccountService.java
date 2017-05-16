package by.andreiblinets.service;

import by.andreiblinets.DTO.InformationAboutUser;

import java.util.Map;

public interface AccountService {

    Map<String, InformationAboutUser> autification(String login, String hashPassword);
    boolean checkingEmailAndPhone(String email, String phone);
}
