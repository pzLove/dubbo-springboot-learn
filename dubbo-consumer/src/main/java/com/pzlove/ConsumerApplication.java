package com.pzlove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 客户端启动
 *
 * @author mingjian.diao
 * @date 2018-07-06 下午5:26
 **/
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
