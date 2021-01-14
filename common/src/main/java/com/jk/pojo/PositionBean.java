package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class PositionBean implements Serializable {

    private static final long serialVersionUID = 4795724588193493411L;

    private Integer positionId;
    private String positionName;//职位名称

}
