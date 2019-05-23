package com.redis;

import com.redis.controller.TestJedisController;
import com.redis.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
public class RedisApplication {


    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }


}
