package com.sasha.dao.impl;

import com.sasha.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Andy on 2018/1/9.
 */
@Repository
public class RedisDaoImpl implements RedisDao {

    //注入jedispool
    @Autowired
    private JedisPool js;


    @Override
    public String set(String key, String value) {
        Jedis jedis = js.getResource();
        String setMessage = jedis.set(key, value);
        return setMessage;
    }

    @Override
    public String getKey(String key) {
        Jedis jedis = js.getResource();
        String getMessage = jedis.get(key);
        return getMessage;
    }
}
