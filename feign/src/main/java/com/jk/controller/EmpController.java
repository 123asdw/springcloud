package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.EmpsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;


@RequestMapping("emp")
@Controller
public class EmpController {
    @Resource
    private EmpsService empService;



    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("addShow1")
    public String addShow1(){
        return "addShow1";
    }

    @RequestMapping("toLogin")
    public String login(){
        return "login";
    }
    @RequestMapping("show")
    public String show(){
        return "show";
    }
    @RequestMapping("show3")
    public String show3(){
        return "show3";
    }
    @RequestMapping("show2")
    public String show2(){
        return "show2";
    }
    @RequestMapping("show1")
    public String show1(){
        return "show1";
    }

    @RequestMapping("findUser")
    @ResponseBody
    public String findUser(){
        return empService.findUser();
    }

    /**
     * 查询
     * @param emp
     * @return
     */
    @RequestMapping("findEmp")
    @ResponseBody
    public HashMap<String,Object> findEmp(EmpBean emp){
        return empService.findEmp(emp);
    }

    /**
     * 新增修改
     * @param emp
     */
    @RequestMapping("addEmp")
    @ResponseBody
    public void addEmp(EmpBean emp){
        empService.addEmp(emp);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("findEmpByIds")
    @ResponseBody
    public EmpBean findEmpByIds(Integer id){
        return empService.findEmpByIds(id);
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("delEmpByIds")
    @ResponseBody
    public void delEmpByIds(Integer id){
        empService.delEmpByIds(id);
    }

    @RequestMapping("findDept")
    @ResponseBody
    public List<DepartmentBean> findDept(){
        return empService.findDept();
    }

    @RequestMapping("findPosition")
    @ResponseBody
    public List<PositionBean> findPosition(){
        return empService.findPosition();
    }

    @RequestMapping("findTree")
    @ResponseBody
    public List<treeBean> findTree(){
        return empService.findTree();
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(userBean user, HttpSession session){

        userBean user2 = empService.findUserByAcoount(user.getAccount());

        //2、判断账号是否存在
        if(user2==null){
            return "登录失败：账号不存在！！！";
        }
        //3、判断密码是否正确
        if(!user.getPassword().equals(user2.getPassword())){
            return "登录失败：密码不正确！！！";
        }

        //把用户信息存入session
        session.setAttribute("user", user2);
        return "登录成功！！！";
    }



    @RequestMapping("findList")
    @ResponseBody
    public HashMap<String,Object> findList(materialBean bean){
        return empService.findList(bean);
    }
    @RequestMapping("finduserList")
    @ResponseBody
    public HashMap<String,Object>finduserList(logionBean bean){

        return  empService.finduserList(bean);


    }
    @RequestMapping("findprizeList")
    @ResponseBody
    public HashMap<String,Object>findprizeList(prizeBean prize){

        return  empService.findprizeList(prize);


    }



}
