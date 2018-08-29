package com.pinyougou.pojo;

import java.io.Serializable;

/**
 * 品牌实体
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2017-12-28<p>
 */
public class Brand implements Serializable {
    /** 品牌编号，主键id */
    private Long id;
    /** 品牌名称 */
    private String name;
    /** 品牌首字母*/
    private String firstChar;

    /** setter and getter */
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
    public String getFirstChar() {
        return firstChar;
    }
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}