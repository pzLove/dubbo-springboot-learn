package com.pzlove.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author mingjian.diao
 * @date 2018-07-06 下午5:56
 **/
@Getter
@Setter
@ToString
public class User implements Serializable{
    private int id;
    private String username;
    private String password;

}
