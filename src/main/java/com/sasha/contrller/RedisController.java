package com.sasha.contrller;

import com.sasha.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2018/1/9.
 */
@RestController
public class RedisController {

    @Autowired
    private RedisServiceImpl redisService;

    @RequestMapping("/redis/{key}/{value}")
    public String setRedis(@PathVariable String key, @PathVariable String value) {
        String setMessage = redisService.set(key, value);
        return setMessage;
    }

    @RequestMapping("/redis/{key}")
    public String getRedis(@PathVariable String key) {
        String valueMessage = redisService.getKey(key);
        return valueMessage;

    }
}
