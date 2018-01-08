package com.sasha.contrller;

import com.sasha.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2018/1/9.
 * RestController = @Controller  @ResponseBody
 */
@RestController
public class UserController {


    @RequestMapping("/user")
    public  User  showHello(){

        User user = new User();
        user.setName("小明");
        user.setAddress("北京市朝阳区");
        user.setAge(18);

        return user;
    }
}
