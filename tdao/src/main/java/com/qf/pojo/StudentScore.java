package com.qf.pojo;

import java.util.Date;

public class StudentScore {
    private Integer stuid;

    private String stuname;

    private Integer tearchid;

    private String tearchname;

    private Date time;

    private Double score;

    private String examtype;

    private String course;

    private Integer classid;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getTearchid() {
        return tearchid;
    }

    public void setTearchid(Integer tearchid) {
        this.tearchid = tearchid;
    }

    public String getTearchname() {
        return tearchname;
    }

    public void setTearchname(String tearchname) {
        this.tearchname = tearchname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}