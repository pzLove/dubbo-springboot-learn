package com.pzlove.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author mingjian.diao
 * @date 2018-07-06 下午5:56
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City implements Serializable{

    private Long id;

    private Long provinceId;

    private String cityName;

    private String description;
}
