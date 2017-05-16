package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.entity.TokenUser;
import by.andreiblinets.repository.TokenRepository;
import by.andreiblinets.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenSimple implements TokenService {

    @Autowired
    private TokenRepository repository;

    public List<TokenUser> getAll() {
        return null;
    }

    public TokenUser getByID(long id) {
        return null;
    }

    public TokenUser save(TokenUser city) {
        return null;
    }

    public void remove(long id) {

    }
}
