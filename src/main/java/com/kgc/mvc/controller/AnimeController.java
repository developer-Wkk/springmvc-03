package com.kgc.mvc.controller;

import com.kgc.mvc.bean.Anime;
import com.kgc.mvc.service.AnimeService;
import com.kgc.mvc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @Autowired
    private CategoryService categoryService;

    /**
     * @param : [java.util.Map<java.lang.String,java.lang.Object>]
     * @return : java.lang.String
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 查询动漫列表
     */
    @RequestMapping("/animes")
    public String animeList(Map<String, Object> map) {
        // 调用业务接口，查询所有的动漫列表，存入模型数据
        map.put("animes", animeService.queryAnimeList());

        // 返回目标视图页面
        return "animeList";
    }

    /**
     * @param : [java.util.Map<java.lang.String,java.lang.Object>]
     * @return : java.lang.String
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 跳转添加动漫详情页面
     */
    @RequestMapping("/toAddAnime")
    public String toAddAnime(Map<String, Object> map) {

        // 查询所有的动漫分类
        map.put("categories", categoryService.queryCategoryList());

        // 默认情况下，springmvc的form表单，必须要添加一个command作为属性名的模型数据
        // 跳转添加页面，没有数据需要回显，只需要添加一个空对象，给表单标签使用即可
        map.put("command", new Anime());

        // 跳转到动漫详情页面
        return "animeInfo";
    }

    /**
     * @param : [com.kgc.mvc.bean.Anime]
     * @return : java.lang.String
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 添加动漫 - post请求
     */
    @RequestMapping(value = "/anime", method = RequestMethod.POST)
    public String addAnime(Anime anime) {
        // 调用添加动漫业务接口
        if (animeService.addAnime(anime)) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }

        // 跳转到列表页面
        return "redirect:animes";
    }

    /**
     * @param : [java.util.Map<java.lang.String,java.lang.Object>]
     * @return : java.lang.String
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 修改，跳转动漫详情页面 - get请求
     */
    @RequestMapping(value = "/anime/{id}", method = RequestMethod.GET)
    public String toModAnime(@PathVariable("id") Integer id, Map<String, Object> map) {

        // 查询所有的动漫分类
        map.put("categories", categoryService.queryCategoryList());

        // 查询修改的新闻详情
        map.put("command", animeService.queryAnimeById(id));

        // 跳转到动漫详情页面
        return "animeInfo";
    }

    /**
     * @param : [com.kgc.mvc.bean.Anime]
     * @return : java.lang.String
     * @author : zhukang
     * @date : 2022/4/5
     * @description : 修改动漫 - put请求
     */
    @RequestMapping(value = "/anime", method = RequestMethod.PUT)
    public String modAnime(Anime anime) {
        // 调用修改动漫业务接口
        if (animeService.modAnime(anime)) {
            System.out.println("修改成功!");
        } else {
            System.out.println("修改失败!");
        }

        // 跳转到列表页面
        return "redirect:/animes";
    }

    /**
     * 课后作业：使用rest风格-delete请求方式，实现动漫删除功能
     */
    @RequestMapping(value = "/delAnime/{id}",method = RequestMethod.DELETE)
    public String delAnime(@PathVariable("id") Integer id, Map<String, Object> map) {

        // 根据id获取动漫删除
        if (id > 0) {
            animeService.delAnimeById(id);
        }
        return "redirect:/animes";
    }


}
