package com.sasha.service.impl;

import com.sasha.dao.RedisDao;
import com.sasha.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Andy on 2018/1/9.
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisDao redisDao;

    @Override
    public String set(String key, String value) {
        return redisDao.set(key, value);
    }

    @Override
    public String getKey(String key) {
        return redisDao.getKey(key);
    }
}
