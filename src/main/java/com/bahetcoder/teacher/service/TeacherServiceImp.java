package com.bahetcoder.teacher.service;

import com.bahetcoder.teacher.dao.TeacherDao;
import com.bahetcoder.teacher.entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 教师管理实现类
 */
@Service
public class TeacherServiceImp implements TeacherService{
    @Autowired
    TeacherDao teacherDao;

    /**
     * 查询教师所有信息
     * @param map
     * @return
     */
    @Override
    public List<TeacherEntity> selectAll(Map map) {
        return teacherDao.selectAll(map);
    }

    /**
     * 根据sid删除教师信息
     * @param tid
     * @return
     */
    @Override
    public Integer deleteByTid(Integer tid) {
        teacherDao.deleteByTid(tid);
        return tid;
    }

    /**
     * 新增学生信息
     * @param teacherEntity
     */
    @Override
    public void saveTeacher(TeacherEntity teacherEntity) {
        teacherEntity.setCreatetime(new Date());
        teacherEntity.setState(0);
       teacherDao.saveTeacher(teacherEntity);
    }

    /**
     * 根据sid教师信息
     * @param tid
     * @return
     */
    @Override
    public TeacherEntity selectByTid(Integer tid) {
        return teacherDao.selectByTid(tid);
    }

    /**
     * 更新教师信息
     * @param teacherEntity
     */
    @Override
    public void updateTeacher(TeacherEntity teacherEntity) {
        teacherDao.updateTeacher(teacherEntity);
    }

}
