package com.xmtcyx.miniapi.model;

import java.util.Date;

public class Shop {
    private Long id;

    private String shopname;

    private String shopdes;

    private String shopaddrress;

    private String shoptel;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopdes() {
        return shopdes;
    }

    public void setShopdes(String shopdes) {
        this.shopdes = shopdes == null ? null : shopdes.trim();
    }

    public String getShopaddrress() {
        return shopaddrress;
    }

    public void setShopaddrress(String shopaddrress) {
        this.shopaddrress = shopaddrress == null ? null : shopaddrress.trim();
    }

    public String getShoptel() {
        return shoptel;
    }

    public void setShoptel(String shoptel) {
        this.shoptel = shoptel == null ? null : shoptel.trim();
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