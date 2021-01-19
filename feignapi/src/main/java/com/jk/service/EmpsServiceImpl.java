package com.jk.service;

import com.jk.pojo.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
@Component
public class EmpsServiceImpl implements EmpsService {
    @Override
    public String findUser() {
        return "网路异常！！！！";
    }
    @Override
    public HashMap<String, Object> findEmp(EmpBean food) {
        return null;
    }
    @Override
    public void addEmp(EmpBean food) {
    }
    @Override
    public EmpBean findEmpByIds(Integer id) {
        return null;
    }
    @Override
    public void delEmpByIds(Integer id) {

    }
    @Override
    public List<DepartmentBean> findDept() {
        return null;
    }
    @Override
    public List<PositionBean> findPosition() {
        return null;
    }
    @Override
    public List<treeBean> findTree() {
        return null;
    }
    @Override
    public userBean findUserByAcoount(String account) {
        return null;
    }

    @Override
    public HashMap<String, Object> findList(materialBean bean) {
        return null;
    }
    @Override
    public HashMap<String, Object> finduserList(logionBean bean) {
        return null;
    }
    @Override
    public HashMap<String, Object> findprizeList(prizeBean prize) {
        return null;
    }
    @Override
    public HashMap<String, Object> finduserLists(materialBean bean) {
        return null;
    }
    @Override
    public void add(materialBean bean) {
    }
    @Override
    public HashMap<String, Object> findxiangqingList(PositionBean posit) {
        return null;
    }
    @Override
    public HashMap<String, Object> find(yongbean yong) {
        return null;
    }
    @Override
    public void deleteid(Integer id) {
    }
    @Override
    public HashMap<String, Object> findlistdeng(UseridBean user) {
        return null;
    }
    @Override
    public void addid(prizeBean prize) {
    }
    @Override
    public void deleteid2(Integer id) {
    }
    @Override
    public List<materialBean> findeee() {
        return null;
    }
}
