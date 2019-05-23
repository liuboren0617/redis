package com.redis.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2019/5/23 14:41
 */
@Data
public class User implements Serializable {

    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
