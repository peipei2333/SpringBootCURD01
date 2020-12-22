package com.bahetcoder.score.dao;

import com.bahetcoder.score.entity.ScoreEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ScoreDao {
    /**
     * 查询全部
     * @param map
     * @return
     */
    List<ScoreEntity> selectAll(@Param("content") Map map);

    /**
     * 根据sid查询
     * @param sid
     * @return
     */
    public ScoreEntity selectBySId(Integer sid);

    /**
     * 根据sid删除
     * @param sid
     * @return
     */
    Integer deleteBySId(Integer sid);

    /**
     * 保存数据
     * @param scoreEntity
     */
    public void saveScore(ScoreEntity scoreEntity);

    /**
     * 根据sid修改信息
     * @param scoreEntity
     * @return
     */
    public void updateBySId(ScoreEntity scoreEntity);
}
