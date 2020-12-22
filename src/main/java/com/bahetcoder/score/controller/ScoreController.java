package com.bahetcoder.score.controller;

import com.bahetcoder.score.entity.ScoreEntity;
import com.bahetcoder.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 分数控制器
 */
@Controller
@RequestMapping("score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;

    /**
     * 获取所有学生信息
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectAll")
    public List<ScoreEntity> selectAll(Map map){
        return scoreService.selectAll(map);
    }

    /**
     * 根据sid查询信息
     * @param sid
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectBySId")
    public ScoreEntity selectBySId(Integer sid){
        return scoreService.selectBySId(sid);
    }

    /**
     * 根据sid删除信息
     * @param sid
     * @return
     */
    @RequestMapping("/deleteBySId")
    public String deleteBySId(Integer sid){
        if (!StringUtils.isEmpty(sid)){
            Integer res = scoreService.deleteBySId(sid);
            System.out.println(!StringUtils.isEmpty(sid));
            if (res>0){
                return "redirect:/score/index.html";
            }else {
                return "删除失败！";
            }
        }else {
            return "删除失败！";
        }
    }

    /**
     * 新增信息
     * @param scoreEntity
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveScore")
    public String saveScore(@RequestBody ScoreEntity scoreEntity){
        scoreService.saveScore(scoreEntity);
        return "保存成功";
    }

    /**
     * 根据sid更新信息
     * @param scoreEntity
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateBySId")
    public String updateBySId(@RequestBody ScoreEntity scoreEntity){
        scoreService.updateBySId(scoreEntity);
        return "修改成功";
    }
}
