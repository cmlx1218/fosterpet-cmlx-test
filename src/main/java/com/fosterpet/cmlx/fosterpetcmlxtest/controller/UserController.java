package com.fosterpet.cmlx.fosterpetcmlxtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cmlx
 * @Date 2019-6-20 0020 20:19
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserInfo")
    public String getUserInfo(String userName){
        return "我是"+userName;
    }

}
