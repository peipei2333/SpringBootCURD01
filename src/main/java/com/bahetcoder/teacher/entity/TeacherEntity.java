package com.bahetcoder.teacher.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 教师管理实体类
 */
public class TeacherEntity {
    private Integer tid;

    private String tname;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;

    private Integer state;

    public TeacherEntity() {
    }

    public TeacherEntity(Integer tid, String tname, Date createtime, Integer state) {
        this.tid = tid;
        this.tname = tname;
        this.createtime = createtime;
        this.state = state;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", createtime=" + createtime +
                ", state=" + state +
                '}';
    }
}
