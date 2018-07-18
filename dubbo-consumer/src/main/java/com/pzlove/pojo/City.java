package com.pzlove.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author mingjian.diao
 * @date 2018-07-06 下午5:56
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City implements Serializable{

    private Long id;

    private Long provinceId;

    private String cityName;

    private String description;
}
