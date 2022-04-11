package com.kgc.mvc.dao.impl;

import com.kgc.mvc.bean.Category;
import com.kgc.mvc.dao.CategoryDao;
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
 * Description: CategoryDaoImpl
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> selectCategoryList() {
        return jdbcTemplate.query("select `id`, `name` from category", new BeanPropertyRowMapper<>(Category.class));
    }
}
