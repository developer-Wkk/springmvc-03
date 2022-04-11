package com.kgc.mvc.service.impl;

import com.kgc.mvc.bean.Anime;
import com.kgc.mvc.dao.AnimeDao;
import com.kgc.mvc.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: AnimeServiceImpl
 */
@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeDao animeDao;

    @Override
    public List<Anime> queryAnimeList() {
        return animeDao.selectAnimeList();
    }

    @Override
    public boolean addAnime(Anime anime) {
        return animeDao.insertAnime(anime) > 0;
    }

    @Override
    public Anime queryAnimeById(Integer id) {
        return animeDao.selectAnimeById(id);
    }

    @Override
    public boolean modAnime(Anime anime) {
        return animeDao.updateAnime(anime) > 0;
    }

    @Override
    public boolean delAnimeById(Integer id) {
        return animeDao.deleteAnimeById(id)>0;
    }

}
