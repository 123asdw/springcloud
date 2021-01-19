package com.jk.service;

import com.jk.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@FeignClient(value = "PROVIDER",fallback = EmpsServiceImpl.class)
public interface EmpsService {

    @GetMapping("findUser")
    String findUser();
    @GetMapping("findEmp")
    HashMap<String, Object> findEmp(@SpringQueryMap EmpBean emp);
    @PostMapping("addEmp")
    void addEmp(EmpBean emp);
    @GetMapping("findEmpByIds")
    EmpBean findEmpByIds(@RequestParam(value = "id") Integer id);
    @DeleteMapping("delEmpByIds")
    void delEmpByIds(@RequestParam(value = "id") Integer id);
    @GetMapping("findDept")
    List<DepartmentBean> findDept();
    @GetMapping("findPosition")
    List<PositionBean> findPosition();
   @RequestMapping("findTree")
    List<treeBean> findTree();
    @RequestMapping("findUserByAcoount")
    userBean findUserByAcoount(String account);
    @GetMapping("findList")
    HashMap<String, Object> findList(@SpringQueryMap materialBean bean);
    @GetMapping("finduserList")
    HashMap<String, Object> finduserList(@SpringQueryMap logionBean bean);
    @GetMapping("findprizeList")
    HashMap<String, Object> findprizeList(@SpringQueryMap prizeBean prize);
    @GetMapping("finduserLists")
    HashMap<String, Object> finduserLists(@SpringQueryMap materialBean bean);
    @PostMapping("add")
    void add(materialBean bean);
    @GetMapping("findxiangqingList")
    HashMap<String, Object> findxiangqingList(PositionBean posit);
    @GetMapping("find")
    HashMap<String, Object> find(yongbean yong);
    @DeleteMapping("deleteid")
    void deleteid(@RequestParam(value = "id")Integer id);
    @GetMapping("findlistdeng")
    HashMap<String, Object> findlistdeng(UseridBean user);
    @PostMapping("addid")
    void addid(prizeBean prize);
    @DeleteMapping("deleteid2")
    void deleteid2(@RequestParam(value = "id")Integer id);
    @GetMapping("findeee")
    List<materialBean> findeee();
}
