package com.qf.pojo;

import java.util.Date;

public class Suggest {
    private Integer tearchid;

    private String content;

    private String people;

    private Date time;

    public Integer getTearchid() {
        return tearchid;
    }

    public void setTearchid(Integer tearchid) {
        this.tearchid = tearchid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}