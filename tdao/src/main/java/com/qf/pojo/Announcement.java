package com.qf.pojo;

import java.util.Date;

public class Announcement {
    private Integer id;

    private Integer annno;

    private Date anntime;

    private String anncontent;

    private String annman;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnnno() {
        return annno;
    }

    public void setAnnno(Integer annno) {
        this.annno = annno;
    }

    public Date getAnntime() {
        return anntime;
    }

    public void setAnntime(Date anntime) {
        this.anntime = anntime;
    }

    public String getAnncontent() {
        return anncontent;
    }

    public void setAnncontent(String anncontent) {
        this.anncontent = anncontent;
    }

    public String getAnnman() {
        return annman;
    }

    public void setAnnman(String annman) {
        this.annman = annman;
    }
}