package com.pzlove.controller;

import com.pzlove.service.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private CityDubboConsumerService service;


    @RequestMapping("/printCity")
    public void printCity() {
        service.printCity();
    }
}