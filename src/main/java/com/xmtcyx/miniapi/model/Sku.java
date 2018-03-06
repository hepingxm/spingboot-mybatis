package com.xmtcyx.miniapi.model;

import java.util.Date;

public class Sku {
    private Long id;

    private Long goodid;

    private String skuattr;

    private Long price;

    private Integer num;

    private Integer skusale;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    private Long cutprice;

    private Long goodimgid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodid() {
        return goodid;
    }

    public void setGoodid(Long goodid) {
        this.goodid = goodid;
    }

    public String getSkuattr() {
        return skuattr;
    }

    public void setSkuattr(String skuattr) {
        this.skuattr = skuattr == null ? null : skuattr.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSkusale() {
        return skusale;
    }

    public void setSkusale(Integer skusale) {
        this.skusale = skusale;
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

    public Long getCutprice() {
        return cutprice;
    }

    public void setCutprice(Long cutprice) {
        this.cutprice = cutprice;
    }

    public Long getGoodimgid() {
        return goodimgid;
    }

    public void setGoodimgid(Long goodimgid) {
        this.goodimgid = goodimgid;
    }
}