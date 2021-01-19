package com.jk.service;

import com.jk.pojo.*;

import java.util.HashMap;
import java.util.List;


public interface EmpService {
    
    HashMap<String, Object> findEmp(EmpBean emp);
    void addEmp(EmpBean emp);
    EmpBean findEmpByIds(Integer id);
    void delEmpByIds(Integer id);
    List<DepartmentBean> findDept();
    List<PositionBean> findPosition();
    List<treeBean> findTree();
    userBean findUserByAcoount(String account);
    HashMap<String, Object> findList(materialBean bean);
    HashMap<String, Object> finduserList(logionBean bean);
    HashMap<String, Object> findprizeList(prizeBean prize);
    HashMap<String, Object> finduserLists(materialBean bean);
    void add(materialBean bean);
    HashMap<String, Object> findxiangqingList(PositionBean posit);
    HashMap<String, Object> find(yongbean yong);

    void deleteid(Integer id);

    HashMap<String, Object> findlistdeng(UseridBean user);

    void addid(prizeBean prize);

    void deleteid2(Integer id);

    List<materialBean> findeee();
}
