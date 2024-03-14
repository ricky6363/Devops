package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.login;
import com.example.demo.repo.logrepo;

@Service
public class logservice {

    @Autowired
    private logrepo rep;

    public login log(String username, String password)
    {
        login user=rep.findByUsernameAndPassword(username,password);
        return user;
    }

}