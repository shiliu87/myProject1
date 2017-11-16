package com.qf.pojo;

import java.util.Date;

public class Message {
    private Integer stuid;

    private Integer tearchid;

    private String content;

    private Integer contno;

    private String title;

    private String subject;

    private Date time;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

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

    public Integer getContno() {
        return contno;
    }

    public void setContno(Integer contno) {
        this.contno = contno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}