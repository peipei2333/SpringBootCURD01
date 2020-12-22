package com.bahetcoder.score.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ScoreEntity {
    private Integer sid;
    private Integer stuid;
    private Integer cid;
    private Integer score;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;
    private Integer state;

    public ScoreEntity() {
    }

    public ScoreEntity(Integer sid, Integer stuid, Integer cid, Integer score, Date createtime, Integer state) {
        this.sid = sid;
        this.stuid = stuid;
        this.cid = cid;
        this.score = score;
        this.createtime = createtime;
        this.state = state;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
        return "ScoreEntity{" +
                "sid=" + sid +
                ", stuid=" + stuid +
                ", cid=" + cid +
                ", score=" + score +
                ", createtime=" + createtime +
                ", state=" + state +
                '}';
    }
}
