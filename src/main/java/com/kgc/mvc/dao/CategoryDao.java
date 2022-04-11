package com.kgc.mvc.dao;

import com.kgc.mvc.bean.Category;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: 分类持久化接口
 */
public interface CategoryDao {

    /**
     * @author : zhukang
     * @date   : 2022/4/5
     * @param  : []
     * @return : java.util.List<com.kgc.mvc.bean.Category>
     * @description : 查询分类列表
     */
    List<Category> selectCategoryList();
}
