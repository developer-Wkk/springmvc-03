package com.kgc.mvc.dao;

import com.kgc.mvc.bean.Anime;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: 动漫持久层接口
 */
public interface AnimeDao {

    /**
     * @author : zhukang
     * @date   : 2022/4/5
     * @param  : []
     * @return : java.util.List<com.kgc.mvc.bean.Anime>
     * @description : 查询所有动漫列表
     */
    List<Anime> selectAnimeList();

    /**
     * @author : zhukang
     * @date   : 2022/4/5
     * @param  : [com.kgc.mvc.bean.Anime]
     * @return : int
     * @description : 插入动漫详情
     */
    int insertAnime(Anime anime);

    /**
     * @author : zhukang
     * @date   : 2022/4/5
     * @param  : [java.lang.Integer]
     * @return : com.kgc.mvc.bean.Anime
     * @description : 根据动漫编号，查询动漫详情
     */
    Anime selectAnimeById(Integer id);

    /**
     * @author : zhukang
     * @date   : 2022/4/5
     * @param  : [com.kgc.mvc.bean.Anime]
     * @return : int
     * @description : 更新动漫详情
     */
    int updateAnime(Anime anime);

/**
 * @author : WangKuoKuo
 * @date   : 2022/4/5/005
 * @param  : [id]
 * @return : int
 * @description : 根据id删除一个动漫详情
 */
    int deleteAnimeById(Integer id);
}
