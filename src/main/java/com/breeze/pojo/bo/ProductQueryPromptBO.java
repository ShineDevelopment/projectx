package com.breeze.pojo.bo;

/**
 * @author Created by wdnnccey
 * @date 2019-06-29 23:15
 * @Description: 产品首页查询关键词键入提示产品
 */
public class ProductQueryPromptBO {

    /**
     * 商品Id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    public ProductQueryPromptBO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
