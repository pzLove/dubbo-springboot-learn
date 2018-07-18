package com.pzlove.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.pzlove.pojo.City;
import com.pzlove.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 * <p>
 * Created by Jaycekon on 20/09/2017.
 */
@Component
public class CityDubboConsumerService {

    @Reference
    CityDubboService cityDubboService;

    @Reference
    UserService userService;

    public void printCity() {
        String cityName = "广州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }


    public User saveUser() {
        User user = new User();
        user.setUsername("hello world!")
                .setPassword("123456");
        return userService.saveUser(user);

    }
}