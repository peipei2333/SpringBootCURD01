package com.bahetcoder.course.service;

import com.bahetcoder.course.entity.CourseEntity;

import java.util.List;
import java.util.Map;

/**
 * 课程信息接口
 */
public interface CourseService {
    /**
     * 查询所有课程信息
     * @param map
     * @return
     */
    public List<CourseEntity> selectAll(Map map);

    /**
     * 根据cid删除课程信息
     * @param cid
     * @return
     */
    public Integer deleteByCid(Integer cid);

    /**
     * 新增课程信息
     * @param courseEntity
     */
    public void saveCourse(CourseEntity courseEntity);

    /**
     * 根据cid查询课程信息
     * @param cid
     * @return
     */
    public CourseEntity selectByCid(Integer cid);

    /**
     * 更新课程信息
     * @param courseEntity
     */
    public void updateCourseByCid(CourseEntity courseEntity);


}
