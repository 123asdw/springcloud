package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;

public class PositionBean implements Serializable {

    private static final long serialVersionUID = 4795724588193493411L;

    private Integer positionId;
    private String positionName;
    private Integer page;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
