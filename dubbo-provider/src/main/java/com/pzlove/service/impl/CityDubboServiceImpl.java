package com.pzlove.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pzlove.pojo.City;
import com.pzlove.service.CityDubboService;


@Service
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"广州","是我的故乡");
    }
}