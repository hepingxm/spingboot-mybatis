package com.xmtcyx.miniapi.model;

public class CutsList {
    private Long id;

    private Long faqirenid;

    private Long usrid;

    private Long cutprice;

    private String say;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFaqirenid() {
        return faqirenid;
    }

    public void setFaqirenid(Long faqirenid) {
        this.faqirenid = faqirenid;
    }

    public Long getUsrid() {
        return usrid;
    }

    public void setUsrid(Long usrid) {
        this.usrid = usrid;
    }

    public Long getCutprice() {
        return cutprice;
    }

    public void setCutprice(Long cutprice) {
        this.cutprice = cutprice;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say == null ? null : say.trim();
    }
}