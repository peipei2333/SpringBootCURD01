package com.bahetcoder.student.controller;

import com.bahetcoder.student.entity.StudentEntity;
import com.bahetcoder.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 学生信息控制器
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    /**
     * 查询所有的数据
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectAll")
    public List<StudentEntity> selectAll(Map map){
//        List<StudentEntity> list = studentService.selectAll(map);
        return studentService.selectAll(map);
    }

    /**
     * 通过ID删除数据
     * @param sid
     * @return
     */
    @RequestMapping(value = "/deleteBySid")
    public String deleteBySid(Integer sid){
        if (sid !=null){
            Integer res = studentService.deleteBySid(sid);
            System.out.println(res);
            if (res>0){
                return "redirect:/index.html";
            }else {
                return "删除失败！";
            }
        }else {
            return "删除失败！";
        }
    }

    /**
     * 新增学生信息
     * @param studentEntity
     * @return
     */
    @RequestMapping(value = "/saveStudent")
    @ResponseBody
    public String saveStudent(@RequestBody StudentEntity studentEntity){
        studentService.saveStudent(studentEntity);
        return "保存成功";
    }

    /**
     * 根据sid查询学生所有信息
     * @param sid
     * @return
     */
    @RequestMapping(value = "/selectBySid")
    @ResponseBody
    public StudentEntity selectBySid(Integer sid){
        return studentService.selectBySid(sid);
    }

    /**
     * 根据sid修改学生信息
     * @param studentEntity
     * @return
     */
    @RequestMapping(value = "/updateStudentBySid")
    @ResponseBody
    public String updateStudentBySiD(@RequestBody StudentEntity studentEntity){
        studentService.updateStudentBySid(studentEntity);
        return "修改成功！";
    }
}
