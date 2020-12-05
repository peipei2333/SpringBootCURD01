package com.bahetcoder.student.dao;

import com.bahetcoder.student.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 学生数据Mapper
 */
@Mapper
public interface StudentDao {
    /**
     * 查询所有学生信息
     * @param map
     * @return
     */
    List<StudentEntity> selectAll(@Param("content") Map map);

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
     * 根据sid修改学生信息
     * @param studentEntity
     * @return
     */
    public void updateStudentBySid(StudentEntity studentEntity);
}
