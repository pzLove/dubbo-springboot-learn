package com.pzlove.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author mingjian.diao
 * @date 2018-07-06 下午5:56
 **/
@Data
@Accessors(chain = true)
public class User implements Serializable{
    private int id;
    private String username;
    private String password;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
