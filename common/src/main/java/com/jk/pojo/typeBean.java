package com.jk.pojo;

import java.io.Serializable;

/**
 * Package: com.jk.pojo
 * <p>
 * Description： TODO
 * <p>
 * Author: zxw
 * <p>
 * Date: Created in 2021/1/13 14:29
 * <p>
 * Company: 11
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class typeBean implements Serializable {
    private static final long serialVersionUID = 4300870864482358527L;

    private  Integer id;
    private  String name;

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
}
