package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springcloud-feign
 * @description:
 * @author: 刘洋朋
 * @create: 2021-01-08 19:15
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("findTest")
    @ResponseBody
    public String findTest(){
        return "牛逼";
    }
}
