package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;

import java.util.List;

public interface BrandService {
    /**
     * 根据类别ID查询品牌列表
     * @param id
     * @return
     */
    public List<Brand> findByCategory(Integer id);
}
