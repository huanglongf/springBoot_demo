package com.sasha.contrller;

import com.sasha.pojo.BaseDict;
import com.sasha.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Andy on 2018/1/10.
 */
@RestController
public class BaseDictController {

    @Autowired
    private BaseDictService baseDictService;

    @RequestMapping("/findall")
    public List findAll(){
        List<BaseDict> list = baseDictService.findAll();
        return list;
    }
}
