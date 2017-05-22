package by.andreiblinets.service.serviceimpl;

import by.andreiblinets.DTO.InformationAboutUser;
import by.andreiblinets.DTO.UserRegistration;
import by.andreiblinets.entity.TokenUser;
import by.andreiblinets.entity.User;
import by.andreiblinets.entity.enums.UserRole;
import by.andreiblinets.repository.TokenRepository;
import by.andreiblinets.repository.UserRepository;
import by.andreiblinets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserSimple implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TokenRepository tokenRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getByID(long id) {
        return null;
    }

    public String save(UserRegistration user) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss");
        User userSaveInBD = new User();
        userSaveInBD.setAboutUser(user.getAboutUser());
        userSaveInBD.setDataTimeRegistration(date);
        userSaveInBD.setEmail(user.getEmail());
        userSaveInBD.setFoto(" ");
        userSaveInBD.setHashPassword(user.getHashPassword());
        userSaveInBD.setName(user.getName());
        userSaveInBD.setPhone(user.getPhone());
        userSaveInBD.setRating(100);
        userSaveInBD.setRoleUser(String.valueOf(UserRole.DISPATCHER));
        userSaveInBD.setSurname(user.getSurname());
        String token = user.getEmail() + "&" +
                user.getName() + "&" +
                user.getSurname() + "&" +
                dateFormat.format(new Date());

        TokenUser objTokenUser = new TokenUser();
        objTokenUser.setToken(token);
        objTokenUser.setUser(userSaveInBD);
        tokenRepository.saveAndFlush(objTokenUser);
        return token;
    }

    public void remove(long id) {

    }

    public HashMap<String, InformationAboutUser> autification(String login, String hashPassword) {
        User user = userRepository.autification(login,hashPassword);
        HashMap<String,InformationAboutUser> map = new HashMap<String, InformationAboutUser>();
        if(user != null)
        {
            InformationAboutUser obj = new InformationAboutUser();
            obj.setEmail(user.getEmail());
            obj.setFoto(user.getFoto());
            obj.setName(user.getName());
            obj.setPhone(user.getPhone());
            obj.setRating(user.getRating());
            obj.setSurname(user.getSurname());
            TokenUser tokenUser = tokenRepository.findByIdUser(user.getId());
            map.put(tokenUser.getToken(),obj);
            return map;
        }
        else
        {
            map.put("",null);
            return map;
        }
    }

    public HashMap<String, InformationAboutUser> getInformation(String token) {
        TokenUser objTokenUser = tokenRepository.findByToken(token);
        HashMap<String,InformationAboutUser> map = new HashMap<String, InformationAboutUser>();
        if(objTokenUser != null) {
            User user = userRepository.findOne(objTokenUser.getUser().getId());
            InformationAboutUser obj = new InformationAboutUser();
            obj.setEmail(user.getEmail());
            obj.setFoto(user.getFoto());
            obj.setName(user.getName());
            obj.setPhone(user.getPhone());
            obj.setRating(user.getRating());
            obj.setSurname(user.getSurname());
            map.put(token, obj);
        }
        else
        {
            map.put(token,null);
        }
        return map;
    }

    public boolean checkingEmail(String email) {
        User user = userRepository.checkingEmail(email);
        if (user == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean checkingPhone(String phone) {
        User user = userRepository.checkingPhone(phone);
        if (user == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
