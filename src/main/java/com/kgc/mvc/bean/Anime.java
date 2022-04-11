package com.kgc.mvc.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created On : 2022/4/5.
 * <p>
 * Author : zhukang
 * <p>
 * Description: 动漫实体
 */
@Data
public class Anime implements Serializable {

    // 编号
    private Integer id;

    // 分类编号
    private Integer cid;

    // 名称
    private String name;

    // 作者
    private String author;

    // 主角
    private String actor;

    // 创建时间
    private Date createDate;
}
