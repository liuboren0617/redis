package com.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/4/26 15:39
 */
@RestController
@EnableCaching
public class TestJedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("test")
    @Cacheable(value = "java", key = "1")
    public String test() {
        System.out.println("调用了方法");
        return stringRedisTemplate.opsForValue().get("java");
    }

    @GetMapping("get_java")
    @Cacheable(value = "nameCache", key = "#name")
    public String test1() {
        return stringRedisTemplate.opsForValue().get("java");
    }


    @GetMapping("hello")
    @Cacheable(value = "java", key = "2")
    public String hello() {
        System.out.println("调用了方法");
        return stringRedisTemplate.opsForValue().get("java");
    }

    @GetMapping("hello1")
    @Cacheable(value = "java")
    public String hello1() {
        System.out.println("调用了方法");
        return stringRedisTemplate.opsForValue().get("java");
    }


    @GetMapping("clear")
    @CacheEvict(value = "java",allEntries=true)
    public String clear() {
        return "清空java缓存";
    }

}
