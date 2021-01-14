package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpDao {
    int Total(@Param("emp") EmpBean emp);

    List<EmpBean> findEmp(@Param("start") int start, @Param("rows") Integer rows,@Param("emp") EmpBean emp);

    @Insert("insert into t_emp (name,pwd,positionId,departmentId,pay,motto)values(#{name},#{pwd},#{positionId},#{departmentId},#{pay},#{motto})")
    void addEmp(EmpBean emp);

    @Update("update t_emp set name=#{name},pwd=#{pwd},positionId=#{positionId},departmentId=#{departmentId},pay=#{pay},motto=#{motto} where id=#{id}")
    void updEmp(EmpBean emp);

    @Select("select * from t_emp e LEFT JOIN t_department d on e.departmentId=d.departmentId LEFT JOIN t_position p on e.positionId=p.positionId where e.id=#{id}")
    EmpBean findEmpByIds(Integer id);

    @Delete("delete from t_emp where id=#{id}")
    void delEmpByIds(Integer id);

    @Select("select * from t_department")
    List<DepartmentBean> findDept();

    @Select("select * from t_position")
    List<PositionBean> findPosition();


    List<treeBean> findTreeByPid(int pid);

    userBean findUserByAcoount(String account);

    int count(@Param("bean")materialBean bean);

    List<EmpBean> findList(@Param("start")int start, @Param("rows")Integer rows, @Param("bean")materialBean bean);

    int count1(@Param("prize")prizeBean prize);

    List<prizeBean> findprizeList(@Param("start")int start, @Param("start")Integer rows, @Param("prize")prizeBean prize);
}
