package com.xmtcyx.miniapi.model;

import java.util.Date;

public class ShipCarGoods {
    private Long id;

    private Long shipcarid;

    private Long shopid;

    private Long goodid;

    private Integer goodnum;

    private String goodattrs;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShipcarid() {
        return shipcarid;
    }

    public void setShipcarid(Long shipcarid) {
        this.shipcarid = shipcarid;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getGoodid() {
        return goodid;
    }

    public void setGoodid(Long goodid) {
        this.goodid = goodid;
    }

    public Integer getGoodnum() {
        return goodnum;
    }

    public void setGoodnum(Integer goodnum) {
        this.goodnum = goodnum;
    }

    public String getGoodattrs() {
        return goodattrs;
    }

    public void setGoodattrs(String goodattrs) {
        this.goodattrs = goodattrs == null ? null : goodattrs.trim();
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