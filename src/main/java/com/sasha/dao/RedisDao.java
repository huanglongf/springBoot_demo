package com.sasha.dao;

/**
 * Created by Andy on 2018/1/9.
 */
public interface RedisDao {
    public String set(String key,String  value);
    public String getKey(String key);
}
