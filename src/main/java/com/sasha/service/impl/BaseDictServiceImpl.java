package com.sasha.service.impl;

import com.sasha.mapper.BaseDictMapper;
import com.sasha.pojo.BaseDict;
import com.sasha.pojo.BaseDictExample;
import com.sasha.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andy on 2018/1/10.
 */
@Service
public class BaseDictServiceImpl implements BaseDictService{
    //
    @Autowired
    private BaseDictMapper baseDictMapper;


    @Override
    public List<BaseDict> findAll() {
        BaseDictExample example = new BaseDictExample();
        return baseDictMapper.selectByExample(example);
    }
}
