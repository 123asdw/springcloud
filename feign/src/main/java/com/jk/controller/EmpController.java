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
import java.util.Objects;
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
    @RequestMapping("addShow2")
    public String addShow2(){
        return "addShow2";
    }
    @RequestMapping("addShow3")
    public String addShow3(){
        return "addShow3";
    }
    @RequestMapping("addShow4")
    public String addShow4(){
        return "addShow4";
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
    @RequestMapping("show5")
    public String show5(){
        return "show5";
    }
    @RequestMapping("show7")
    public String show7(){
        return "show7";
    }
    @RequestMapping("show8")
    public String show8(){
        return "show8";
    }
    @RequestMapping("show9")
    public String show9(){
        return "show9";
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
    @RequestMapping("finduserLists")
    @ResponseBody
    public HashMap<String, Object>finduserLists(materialBean bean){
    return empService.finduserLists(bean);
    }

    @RequestMapping("add")
    @ResponseBody
    public  void add(materialBean bean){
        empService.add(bean);
    }

    @RequestMapping("findxiangqingList")
    @ResponseBody
    public HashMap<String,Object>findxiangqingList(PositionBean posit){
        return empService.findxiangqingList(posit);
    }


    @RequestMapping("find")
    @ResponseBody
    public  HashMap<String,Object>find(yongbean yong){
        return  empService.find(yong);
    }
    @RequestMapping("deleteid")
    @ResponseBody
    public void deleteid(Integer id){
        empService.deleteid(id);
    }
    @RequestMapping("findlistdeng")
    @ResponseBody
    public HashMap<String,Object>findlistdeng(UseridBean user){
        return empService.findlistdeng(user);
    }
    @RequestMapping("addid")
    @ResponseBody
    public void addid(prizeBean prize){
        empService.addid(prize);
    }
    @RequestMapping("deleteid2")
    @ResponseBody
    public void deleteid2(Integer id){
        empService.deleteid2(id);
    }
    @RequestMapping("findeee")
    @ResponseBody
    public List<materialBean>findeee(){
        return empService.findeee();
    }
}