package com.bahetcoder.teacher.controller;

import com.bahetcoder.teacher.entity.TeacherEntity;
import com.bahetcoder.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 教师管理控制器
 */
@Controller
@RequestMapping(value = "teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    /**
     * 查询所有教师信息
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectAll")
    public List<TeacherEntity> selectAll(Map map){
        return teacherService.selectAll(map);
    }

    /**
     * 根据tid删除教师信息
     * @param tid
     * @return
     */
    @RequestMapping("/deleteByTid")
    public String deleteByTid(Integer tid){
        if (tid !=null){
            Integer res = teacherService.deleteByTid(tid);
            System.out.println(res);
            if (res>0){
                return "redirect:/teacher/index.html";
            }else {
                return "删除失败！";
            }
        }else {
            return "删除失败！";
        }
    }

    /**
     * 新增教师信息
     * @param teacherEntity
     * @return
     */
    @RequestMapping("/saveTeacher")
    @ResponseBody
    public String saveTeacher(@RequestBody TeacherEntity teacherEntity){
        teacherService.saveTeacher(teacherEntity);
        return "新增成功！";
    }

    /**
     * 根据tid查询教师信息
     * @param tid
     * @return
     */
    @RequestMapping("/selectByTid")
    @ResponseBody
    public TeacherEntity selectByTid(Integer tid){
        return teacherService.selectByTid(tid);
    }

    /**
     * 根据tid修改教师信息
     * @param teacherEntity
     */
    @RequestMapping("/updateTeacherByTid")
    @ResponseBody
    public String updateTeacherByTid(@RequestBody TeacherEntity teacherEntity){
        teacherService.updateTeacher(teacherEntity);
        return "修改成功！";
    }
}
