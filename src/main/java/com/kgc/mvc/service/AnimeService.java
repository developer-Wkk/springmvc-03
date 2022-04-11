package com.kgc.mvc.service;

import com.kgc.mvc.bean.Anime;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: 动漫业务接口
 */
public interface AnimeService {

    /**
     * @param : []
     * @return : java.util.List<com.kgc.mvc.bean.Anime>
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 查询动漫列表
     */
    List<Anime> queryAnimeList();

    /**
     * @param : [com.kgc.mvc.bean.Anime]
     * @return : boolean
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 添加动漫
     */
    boolean addAnime(Anime anime);

    /**
     * @param : [java.lang.Integer]
     * @return : com.kgc.mvc.bean.Anime
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 根据动漫编号，查询动漫详情
     */
    Anime queryAnimeById(Integer id);

    /**
     * @param : [com.kgc.mvc.bean.Anime]
     * @return : boolean
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 修改动漫
     */
    boolean modAnime(Anime anime);

    /**
     * @param : [id]
     * @return : com.kgc.mvc.bean.Anime
     * @author : WangKuoKuo
     * @date : 2022/4/5/005
     * @description : 根据id删除
     */
    boolean delAnimeById(Integer id);


}
