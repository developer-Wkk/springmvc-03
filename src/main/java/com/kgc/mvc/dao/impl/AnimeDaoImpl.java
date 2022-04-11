package com.kgc.mvc.dao.impl;

import com.kgc.mvc.bean.Anime;
import com.kgc.mvc.dao.AnimeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: AnimeDaoImpl
 */
@Repository
public class AnimeDaoImpl implements AnimeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Anime> selectAnimeList() {
        // 查询动漫列表
        return jdbcTemplate.query("select `id`,`cid`,`name`,`author`,`actor`,`create_date` from `animes`", new BeanPropertyRowMapper<>(Anime.class));
    }

    @Override
    public int insertAnime(Anime anime) {
        return jdbcTemplate.update("insert into `animes`(`cid`,`name`,`author`,`actor`,`create_date`) values (?,?,?,?, now())", anime.getCid(), anime.getName(), anime.getAuthor(), anime.getActor());
    }

    @Override
    public Anime selectAnimeById(Integer id) {
        return jdbcTemplate.queryForObject("select `id`,`cid`,`name`,`author`,`actor`,`create_date` from `animes` where `id` = ?", new BeanPropertyRowMapper<>(Anime.class), id);
    }

    @Override
    public int updateAnime(Anime anime) {
        return jdbcTemplate.update("update `animes` set `cid` = ?, `name` = ?, `author` = ?, `actor` = ? where `id` = ?", anime.getCid(), anime.getName(), anime.getAuthor(), anime.getActor(), anime.getId());
    }
    @Override
    public int deleteAnimeById(Integer id) {
        return jdbcTemplate.update("delete from `animes` where `id` = ? ",id);
    }
}
