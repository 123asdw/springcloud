package com.jk.pojo;

import java.io.Serializable;

/**
 * Package: com.jk.pojo
 * <p>
 * Description： TODO
 * <p>
 * Author: zxw
 * <p>
 * Date: Created in 2021/1/12 14:28
 * <p>
 * Company: 11
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class userBean implements Serializable {
    private static final long serialVersionUID = 1829395460058651803L;

   /* Id	NUMBER(10)	主键
    ACCOUNT	Varchar2(100)	账号
    PASSWORD	Varchar2(100)	密码*/


   private Integer id;
   private  String account;
   private  String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
