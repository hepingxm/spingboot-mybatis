package com.xmtcyx.miniapi.model;

public class Act {
    private Long id;

    private String actname;

    private String actdes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname == null ? null : actname.trim();
    }

    public String getActdes() {
        return actdes;
    }

    public void setActdes(String actdes) {
        this.actdes = actdes == null ? null : actdes.trim();
    }
}