package com.sasha.service;

/**
 * Created by Andy on 2018/1/9.
 */
public interface RedisService {
    public String set(String key,String  value);
    public String getKey(String key);
}
