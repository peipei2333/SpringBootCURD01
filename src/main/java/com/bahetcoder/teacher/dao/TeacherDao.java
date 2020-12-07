package com.bahetcoder.teacher.dao;

import com.bahetcoder.teacher.entity.TeacherEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 教师管理MAPPER
 */
@Mapper
public interface TeacherDao {
    /**
     * 查询教师所有信息
     * @param map
     * @return
     */
    List<TeacherEntity> selectAll(@Param("content")Map map);

    /**
     * 根据sid删除教师信息
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
     * 根据sid查询教师信息
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
