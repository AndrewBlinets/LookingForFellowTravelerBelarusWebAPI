package by.andreiblinets.controller;

import by.andreiblinets.constant.TokenConstant;
import by.andreiblinets.entity.TokenUser;
import by.andreiblinets.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TokenController  {

    @Autowired
    private TokenService service;

    @RequestMapping(value = TokenConstant.TOKENS, method = RequestMethod.GET)
    @ResponseBody
    public List<TokenUser> getCity()
    {
        return service.getAll();
    }

}
