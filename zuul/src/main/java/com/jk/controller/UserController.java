package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @program: springcloud-emp
 * @description:
 * @author: 刘洋朋
 * @create: 2021-01-11 17:08
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    @ResponseBody
    public String findUser(HttpSession session){
        String aa="aa";
        session.setAttribute("user",aa);
        return "登陆成功";
    }


}
