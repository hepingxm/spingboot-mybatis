package com.xmtcyx.miniapi.model;

import java.util.Date;

public class Good {
    private Long id;

    private String goodname;

    private String gooddes;

    private Long typeid;

    private Long shopid;

    private Integer spusale;

    private Integer saynum;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    private String goodfistimg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public String getGooddes() {
        return gooddes;
    }

    public void setGooddes(String gooddes) {
        this.gooddes = gooddes == null ? null : gooddes.trim();
    }

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Integer getSpusale() {
        return spusale;
    }

    public void setSpusale(Integer spusale) {
        this.spusale = spusale;
    }

    public Integer getSaynum() {
        return saynum;
    }

    public void setSaynum(Integer saynum) {
        this.saynum = saynum;
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

    public String getGoodfistimg() {
        return goodfistimg;
    }

    public void setGoodfistimg(String goodfistimg) {
        this.goodfistimg = goodfistimg == null ? null : goodfistimg.trim();
    }
}