package com.bahetcoder.student.service;

import com.bahetcoder.student.dao.StudentDao;
import com.bahetcoder.student.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 学生信息实现类Service
 */
@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentDao studentDao;
    /**
     * 查询学生所有的信息
     * @param map
     * @return
     */
    @Override
    public List<StudentEntity> selectAll(Map map) {
        return studentDao.selectAll(map);
    }

    /**
     * 根据sid删除学生信息
     * @param sid
     * @return
     */
    @Override
    public Integer deleteBySid(Integer sid) {
        studentDao.deleteBySid(sid);
        return sid;
    }

    /**
     * 新增学生信息
     * @param studentEntity
     */
    @Override
    public void saveStudent(StudentEntity studentEntity) {
        studentEntity.setCreatetime(new Date());
        studentEntity.setState(0);
        studentDao.saveStudent(studentEntity);
    }

    /**
     * 根据sid查询学生所有的信息
     * @param sid
     * @return
     */
    @Override
    public StudentEntity selectBySid(Integer sid) {
        return studentDao.selectBySid(sid);
    }

    /**
     * 根据sid修改学生信息
     * @param studentEntity
     */
    @Override
    public void updateStudentBySid(StudentEntity studentEntity) {
         studentDao.updateStudentBySid(studentEntity);
    }


}
