package com.bahetcoder.course.dao;

import com.bahetcoder.course.entity.CourseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseDao {
    /**
     * 查询所有课程信息
     * @param map
     * @return
     */
    List<CourseEntity> selectAll(Map map);

    /**
     * 根据cid查询课程信息
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
     * 根据cid查询课程所有信息
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
