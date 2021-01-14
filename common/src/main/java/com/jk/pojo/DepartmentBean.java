package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DepartmentBean implements Serializable {

    private static final long serialVersionUID = 1829395460058651803L;

    private Integer departmentId;
    private String departmentName;//职位名称
}
