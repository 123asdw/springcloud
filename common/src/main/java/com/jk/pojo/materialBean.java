package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Package: com.jk.pojo
 * <p>
 * Description： TODO
 * <p>
 * Author: zxw
 * <p>
 * Date: Created in 2021/1/13 14:27
 * <p>
 * Company: 11
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class materialBean implements Serializable {
    private static final long serialVersionUID = 4300870864482358527L;

    private Integer id;
    private String name;
    private  String type;
    private  Integer efficient;
    private Date datetime;
    private String eligibility;


    private  String typename;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    private Integer page;
    private  Integer rows;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getEfficient() {
        return efficient;
    }

    public void setEfficient(Integer efficient) {
        this.efficient = efficient;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
}
