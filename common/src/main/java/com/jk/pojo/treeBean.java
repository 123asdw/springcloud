package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Package: com.jk.pojo
 * <p>
 * Description： TODO
 * <p>
 * Author: zxw
 * <p>
 * Date: Created in 2021/1/12 14:08
 * <p>
 * Company: 11
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class treeBean implements Serializable {
    private static final long serialVersionUID = 1829395460058651803L;
    private Integer id;
    private String text;
    private Integer pid;
    private String href;
    private List<treeBean> nodes;//树节点
    private Boolean selectable;//是否打开选项卡页面 ：true打开  false不打开

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<treeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<treeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }
}
