package com.bahetcoder.teacher.service;

import com.bahetcoder.teacher.entity.TeacherEntity;

import java.util.List;
import java.util.Map;

/**
 * 教师管理Service接口
 */
public interface TeacherService {
    /**
     * 查询所有教师信息
     * @param map
     * @return
     */
    List<TeacherEntity> selectAll(Map map);

    /**
     * 根据tid删除教师信息
     * @param tid
     * @return
     */
    public Integer deleteByTid(Integer tid);

    /**
     * 新增教师信息
     * @param teacherEntity
     */
    public void saveTeacher(TeacherEntity teacherEntity);

    /**
     * 根据tid查询教师所有信息
     * @param tid
     * @return
     */
    public TeacherEntity selectByTid(Integer tid);

    /**
     * 更新教师信息
     * @param teacherEntity
     */
    public void updateTeacher(TeacherEntity teacherEntity);

}
