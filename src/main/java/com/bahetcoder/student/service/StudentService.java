package com.bahetcoder.student.service;

import com.bahetcoder.student.entity.StudentEntity;
import java.util.List;
import java.util.Map;

/**
 * 学生信息接口
 */
public interface StudentService {
    /**
     * 查询学生所有信息
     * @param map
     * @return
     */
    List<StudentEntity> selectAll(Map map);

    /**
     * 根据ID删除学生信息
     * @param sid
     * @return
     */
    Integer deleteBySid(Integer sid);

    /**
     * 新增学生信息
     * @param studentEntity
     */
    public void saveStudent(StudentEntity studentEntity);

    /**
     * 根据sid查询学生所有信息
     * @param sid
     * @return
     */
    public StudentEntity selectBySid(Integer sid);

    /**
     * 根据sdi修改学生信息
     * @param studentEntity
     * @return
     */
    public void updateStudentBySid(StudentEntity studentEntity);
}
