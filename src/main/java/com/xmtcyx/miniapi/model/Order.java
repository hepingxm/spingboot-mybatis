package com.xmtcyx.miniapi.model;

import java.util.Date;

public class Order {
    private Long id;

    private Integer ordernum;

    private Long payprice;

    private Integer ispay;

    private Date paytime;

    private Integer isdeliver;

    private Date delivertime;

    private Integer isreceipt;

    private Date receipttime;

    private Integer isevaluate;

    private Date evaluatetime;

    private Integer isrefound;

    private Date refoundtime;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    private Integer shopid;

    private Integer distype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Long getPayprice() {
        return payprice;
    }

    public void setPayprice(Long payprice) {
        this.payprice = payprice;
    }

    public Integer getIspay() {
        return ispay;
    }

    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getIsdeliver() {
        return isdeliver;
    }

    public void setIsdeliver(Integer isdeliver) {
        this.isdeliver = isdeliver;
    }

    public Date getDelivertime() {
        return delivertime;
    }

    public void setDelivertime(Date delivertime) {
        this.delivertime = delivertime;
    }

    public Integer getIsreceipt() {
        return isreceipt;
    }

    public void setIsreceipt(Integer isreceipt) {
        this.isreceipt = isreceipt;
    }

    public Date getReceipttime() {
        return receipttime;
    }

    public void setReceipttime(Date receipttime) {
        this.receipttime = receipttime;
    }

    public Integer getIsevaluate() {
        return isevaluate;
    }

    public void setIsevaluate(Integer isevaluate) {
        this.isevaluate = isevaluate;
    }

    public Date getEvaluatetime() {
        return evaluatetime;
    }

    public void setEvaluatetime(Date evaluatetime) {
        this.evaluatetime = evaluatetime;
    }

    public Integer getIsrefound() {
        return isrefound;
    }

    public void setIsrefound(Integer isrefound) {
        this.isrefound = isrefound;
    }

    public Date getRefoundtime() {
        return refoundtime;
    }

    public void setRefoundtime(Date refoundtime) {
        this.refoundtime = refoundtime;
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

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getDistype() {
        return distype;
    }

    public void setDistype(Integer distype) {
        this.distype = distype;
    }
}