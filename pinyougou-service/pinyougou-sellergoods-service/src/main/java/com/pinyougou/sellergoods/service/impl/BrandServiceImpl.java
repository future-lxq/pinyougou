package com.pinyougou.sellergoods.service.impl;

import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BrandServiceImpl implements BrandService {

    /**
     * 注入数据访问接口代理对象
     */
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 查询所有品牌
     */
    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
