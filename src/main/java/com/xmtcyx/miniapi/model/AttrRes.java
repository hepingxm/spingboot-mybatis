package com.xmtcyx.miniapi.model;

import java.util.Date;

public class AttrRes {
    private Long id;

    private String attrres;

    private Long attrid;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrres() {
        return attrres;
    }

    public void setAttrres(String attrres) {
        this.attrres = attrres == null ? null : attrres.trim();
    }

    public Long getAttrid() {
        return attrid;
    }

    public void setAttrid(Long attrid) {
        this.attrid = attrid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}