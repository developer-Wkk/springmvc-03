package com.kgc.mvc.service;

import com.kgc.mvc.bean.Category;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: 分类业务接口
 */
public interface CategoryService {

    /**
     * @author : zhukang
     * @date   : 2022/4/5
     * @param  : []
     * @return : java.util.List<com.kgc.mvc.bean.Category>
     * @description : 查询分类列表
     */
    List<Category> queryCategoryList();
}
