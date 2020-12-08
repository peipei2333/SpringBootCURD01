package com.bahetcoder.course.controller;

import com.bahetcoder.course.entity.CourseEntity;
import com.bahetcoder.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 课程信息控制器
 */
@Controller
@RequestMapping("course")
public class CourseController {
    @Autowired
     CourseService courseService;

    /**
     * 查询所有课程信息
     * @param map
     * @return
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<CourseEntity> selectAll(Map map){
        return courseService.selectAll(map);
    }

    /**
     * 根据cid删除课程信息
     * @param cid
     * @return
     */
    @RequestMapping("/deleteByCid")
    public String deleteByCid(Integer cid){
        if (cid!=null){
            Integer res = courseService.deleteByCid(cid);
            if (res>0){
                return "redirect:/course/index.html";
            }else {
                return "删除失败！";
            }
        }else {
            return "删除失败!";
        }
    }

    /**
     * 新增课程信息
     * @param courseEntity
     * @return
     */
    @RequestMapping("/saveCourse")
    @ResponseBody
    public String saveCourse(@RequestBody CourseEntity courseEntity){
         courseService.saveCourse(courseEntity);
        return "新增成功！";
    }

    /**
     * 根据cid查询课程信息
     * @param cid
     * @return
     */
    @RequestMapping("/selectByCid")
    @ResponseBody
    public CourseEntity selectByCid(Integer cid){
        return courseService.selectByCid(cid);
    }

    /**
     * 更新课程信息
     * @param courseEntity
     * @return
     */
    @RequestMapping("/updateCourseByCid")
    @ResponseBody
    public String  updateCourseByCid(@RequestBody CourseEntity courseEntity){
        courseService.updateCourseByCid(courseEntity);
        return "更新成功！";
    }

}
