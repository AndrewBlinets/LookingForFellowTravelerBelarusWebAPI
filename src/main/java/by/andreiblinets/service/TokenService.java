package by.andreiblinets.service;

import by.andreiblinets.entity.TokenUser;

import java.util.List;

public interface TokenService {
    List<TokenUser> getAll();
    TokenUser getByID(long id);
    TokenUser save(TokenUser city);
    void remove(long id);
}
