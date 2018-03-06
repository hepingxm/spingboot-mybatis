package com.xmtcyx.miniapi.model;

import java.util.Date;

public class ShopExpand {
    private Long id;

    private Long shopid;

    private String expandname;

    private String expandinfo;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public String getExpandname() {
        return expandname;
    }

    public void setExpandname(String expandname) {
        this.expandname = expandname == null ? null : expandname.trim();
    }

    public String getExpandinfo() {
        return expandinfo;
    }

    public void setExpandinfo(String expandinfo) {
        this.expandinfo = expandinfo == null ? null : expandinfo.trim();
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