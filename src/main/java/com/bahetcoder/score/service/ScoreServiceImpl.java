package com.bahetcoder.score.service;
import com.bahetcoder.score.dao.ScoreDao;
import com.bahetcoder.score.entity.ScoreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 分数实现类
 */
@Service
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    ScoreDao scoreDao;

    /**
     * 查询全部
     * @param map
     * @return
     */
    @Override
    public List<ScoreEntity> selectAll(Map map) {
        return scoreDao.selectAll(map);
    }

    /**
     * 根据si查询信息
     * @param sid
     * @return
     */
    @Override
    public ScoreEntity selectBySId(Integer sid) {
        return scoreDao.selectBySId(sid);
    }

    /**
     * 根据sid删除信息
     * @param sid
     * @return
     */
    @Override
    public Integer deleteBySId(Integer sid) {
        return scoreDao.deleteBySId(sid);
    }

    /**
     * 新增信息
     * @param scoreEntity
     */
    @Override
    public void saveScore(ScoreEntity scoreEntity) {
        scoreEntity.setState(0);
        scoreEntity.setCreatetime(new Date());
        scoreDao.saveScore(scoreEntity);
    }

    /**
     * 根据sid更新信息
     * @param scoreEntity
     */
    @Override
    public void updateBySId(ScoreEntity scoreEntity) {
        scoreDao.updateBySId(scoreEntity);
    }
}
