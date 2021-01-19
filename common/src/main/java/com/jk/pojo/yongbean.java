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
 * Date: Created in 2021/1/18 10:51
 * <p>
 * Company: 11
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class yongbean implements Serializable {
    private static final long serialVersionUID = 4300870864482358527L;

    private  Integer id;
    private Date timeDate;
    private  String stactus;


    private  Integer page;
    private  Integer rows;


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

    public Date getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(Date timeDate) {
        this.timeDate = timeDate;
    }

    public String getStactus() {
        return stactus;
    }

    public void setStactus(String stactus) {
        this.stactus = stactus;
    }
}
