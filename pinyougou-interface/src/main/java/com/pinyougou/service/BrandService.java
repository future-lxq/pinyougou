package com.pinyougou.service;

import com.pinyougou.pojo.Brand;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有品牌
     */
    List<Brand> findAll();
}
