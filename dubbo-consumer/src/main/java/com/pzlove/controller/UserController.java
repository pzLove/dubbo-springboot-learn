package com.pzlove.controller;

import com.pzlove.service.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private CityDubboConsumerService service;


    @RequestMapping("/saveUser")
    public Object saveUser() {

        return service.saveUser();
    }
}