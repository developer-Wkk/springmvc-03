package com.kgc.mvc.service.impl;

import com.kgc.mvc.bean.Category;
import com.kgc.mvc.dao.CategoryDao;
import com.kgc.mvc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: CategoryServiceImpl
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> queryCategoryList() {
        return categoryDao.selectCategoryList();
    }
}
