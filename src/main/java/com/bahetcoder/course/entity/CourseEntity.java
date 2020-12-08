package com.bahetcoder.course.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 课程管理实体类
 * 此类我就用lombok插件
 */
@Data
public class CourseEntity {
    private Integer cid;

    private String cname;

    private  Integer tid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;

    private Integer state;
}
