package com.bahetcoder.course.service;

import com.bahetcoder.course.dao.CourseDao;
import com.bahetcoder.course.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 课程信息实现类
 */
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseDao courseDao;

    /**
     * 查询所有课程信息
     * @param map
     * @return
     */
    @Override
    public List<CourseEntity> selectAll(Map map) {
        return courseDao.selectAll(map);
    }

    /**
     * 根据cid查询课程信息
     * @param cid
     * @return
     */
    @Override
    public Integer deleteByCid(Integer cid) {
         courseDao.deleteByCid(cid);
         return cid;
    }

    /**
     * 新增课程信息
     * @param courseEntity
     */
    @Override
    public void saveCourse(CourseEntity courseEntity) {
        courseEntity.setCreatetime(new Date());
        courseEntity.setState(0);
        courseDao.saveCourse(courseEntity);
    }

    /**
     * 根据cid查询课程信息
     * @param cid
     * @return
     */
    @Override
    public CourseEntity selectByCid(Integer cid) {
        return courseDao.selectByCid(cid);
    }

    @Override
    public void updateCourseByCid(CourseEntity courseEntity) {
        courseDao.updateCourseByCid(courseEntity);
    }
}
