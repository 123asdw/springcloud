package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpDao {
    int Total(@Param("emp") EmpBean emp);

    List<EmpBean> findEmp(@Param("start") int start, @Param("rows") Integer rows,@Param("emp") EmpBean emp);

    @Insert("insert into t_comment (id,name,comments,datetime)" +
            "values(#{id},#{name},#{comments},SYSDATE())")
    void addEmp(EmpBean emp);

    @Update("update t_comment set name=#{name},comments=#{comments},datetime=#{datetime} where id=#{id}")
    void updEmp(EmpBean emp);

    @Select("select * from t_comment  where id=#{id}")
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

    List<prizeBean> findprizeList(@Param("start")int start, @Param("rows")Integer rows, @Param("prize")prizeBean prize);

    int count2(@Param("bean")materialBean bean);

    List<prizeBean> finduserLists(@Param("start")int start, @Param("rows")Integer rows, @Param("bean") materialBean bean);

    void add(materialBean bean);

    int count3(@Param("posit")PositionBean posit);

    List<prizeBean> findxiangqingList(@Param("start")int start, @Param("rows")Integer rows, @Param("posit")PositionBean posit);

    int count4(@Param("yong")yongbean yong);

    List<prizeBean> find(@Param("start")int start, @Param("rows")Integer rows, @Param("yong")yongbean yong);
    @Delete("delete  from material where id=#{id}")
    void deleteid(Integer id);

    int count5(@Param("user")UseridBean user);

    List<UseridBean> findlistdeng(@Param("start")int start, @Param("rows")Integer rows, @Param("user")UseridBean user);

    void addid(prizeBean prize);
    @Delete("delete  from prize where id=#{id}")
    void deleteid2(Integer id);


    @Select("select * from material")
    List<materialBean> findeee();
}
