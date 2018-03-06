package com.xmtcyx.miniapi.model;

import java.util.Date;

public class ActaExpand {
    private Long id;

    private String expandname;

    private String expandres;

    private Long actid;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpandname() {
        return expandname;
    }

    public void setExpandname(String expandname) {
        this.expandname = expandname == null ? null : expandname.trim();
    }

    public String getExpandres() {
        return expandres;
    }

    public void setExpandres(String expandres) {
        this.expandres = expandres == null ? null : expandres.trim();
    }

    public Long getActid() {
        return actid;
    }

    public void setActid(Long actid) {
        this.actid = actid;
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