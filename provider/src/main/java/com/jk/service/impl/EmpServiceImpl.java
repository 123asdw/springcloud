package com.jk.service.impl;

import com.jk.dao.EmpDao;
import com.jk.pojo.*;
import com.jk.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public HashMap<String, Object> findEmp(EmpBean emp) {
        Integer page = emp.getPage();
        Integer rows = emp.getRows();
        int count =empDao.Total(emp);
        int start = (page-1)*rows;
        List<EmpBean> list= empDao.findEmp(start,rows,emp);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", list);
        return map;
    }
    @Override
    public void addEmp(EmpBean emp) {
        if(emp.getId()==null){
            empDao.addEmp(emp);
        }else{
            empDao.updEmp(emp);
        }
    }
    @Override
    public EmpBean findEmpByIds(Integer id) {
        return empDao.findEmpByIds(id);
    }
    @Override
    public void delEmpByIds(Integer id) {
        empDao.delEmpByIds(id);
    }
    @Override
    public List<DepartmentBean> findDept() {
        return empDao.findDept();
    }
    @Override
    public List<PositionBean> findPosition() {
        return empDao.findPosition();
    }
    @Override
    public List<treeBean> findTree() {
        int pid=0;
        List<treeBean> list = findNodes(pid);
        return list;
}
    @Override
    public userBean findUserByAcoount(String account) {
        return empDao.findUserByAcoount(account);
    }
    @Override
    public HashMap<String, Object> findList(materialBean bean) {
        Integer page = bean.getPage();
        Integer rows = bean.getRows();
        int count =empDao.count(bean);
        int start = (page-1)*rows;
        List<EmpBean> list= empDao.findList(start,rows,bean);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", list);
        return map;
    }
    @Override
    public HashMap<String, Object> finduserList(logionBean bean) {
        logionBean bean1 = new logionBean();
        bean1.setId("1");
        bean1.setName("444");
        bean1.setSite("6554");
        bean1.setTime(new Date());
        mongoTemplate.save(bean1);
        Integer rows = bean.getRows();
        Integer page = bean.getPage();
        Query query = new Query();
        long count = mongoTemplate.count(query , logionBean.class);
        int start =(page-1)*rows;
        query.skip(start).limit(rows);
        List<logionBean> list= mongoTemplate.find(query, logionBean.class);
        HashMap<String, Object> map=new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", list);
        return map;

    }
    @Override
    public HashMap<String, Object> findprizeList(prizeBean prize) {
        Integer page = prize.getPage();
        Integer rows = prize.getRows();
        int count =empDao.count1(prize);
        int start = (page-1)*rows;
        List<prizeBean> list= empDao.findprizeList(start,rows,prize);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", list);
        return map;
    }
    private List<treeBean> findNodes(int pid) {
        List<treeBean> list = empDao.findTreeByPid(pid);
        for (treeBean tree : list) {
            Integer id = tree.getId();
            List<treeBean> nodelist = findNodes(id);
            if(nodelist!=null&&nodelist.size()>0){
                tree.setNodes(nodelist);
                tree.setSelectable(false);
            }else{
                tree.setSelectable(true);
            }
        }
        return list;
    }
    }