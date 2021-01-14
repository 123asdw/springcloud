package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.EmpService;
import com.jk.service.EmpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
@RestController
public class EmpController implements EmpsService {
    @Autowired
    private EmpService empService;
    @Override
    public String findUser() {
        return "666";
    }
    @Override
    public HashMap<String, Object> findEmp(EmpBean emp) {
        return empService.findEmp(emp);
    }
    @Override
    public void addEmp(@RequestBody EmpBean emp) {
        empService.addEmp(emp);
    }
    @Override
    public EmpBean findEmpByIds(Integer id) {
        return empService.findEmpByIds(id);
    }
    @Override
    public void delEmpByIds(Integer id) {
        empService.delEmpByIds(id);
    }
    @Override
    public List<DepartmentBean> findDept() {
        return empService.findDept();
    }
    @Override
    public List<PositionBean> findPosition() {
        return empService.findPosition();
    }
    @Override
    public List<treeBean> findTree() {
        return empService.findTree();
    }
    @Override
    public userBean findUserByAcoount(String account) {
        return empService.findUserByAcoount(account);
    }
    @Override
    public HashMap<String, Object> findList(materialBean bean) {
        return empService.findList(bean);
    }
    @Override
    public HashMap<String, Object> finduserList(logionBean bean) {
        return empService.finduserList(bean);
    }
    @Override
    public HashMap<String, Object> findprizeList(prizeBean prize) {
        return empService.findprizeList(prize);
    }
}