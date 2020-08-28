package com.km.fkSpring.controller;

import com.km.fkSpring.contract.user.IUserService;
import com.km.fkSpring.contract.user.UserDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

    private final IUserService service;

    @Autowired
    public LoginController(IUserService service){
        this.service = service;
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<UserDescriptor> findAll() throws Throwable{
        return service.list();
    }

    @RequestMapping(value = "/findByUserName", method = RequestMethod.POST)
    public UserDescriptor findByUserName(@RequestPart(name = "userName")String username) throws Throwable{
        return service.findByUserName(username);
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public String save(@RequestBody UserDescriptor desc) throws Throwable{
        this.service.save(desc);
        return  "success !";
    }
}
