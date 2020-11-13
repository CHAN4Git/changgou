package com.changgou.goods.service.impl;

import com.changgou.goods.mapper.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 根据类别ID查询品牌列表
     *
     * @param id
     * @return
     */
    @Override
    public List<Brand> findByCategory(Integer id) {
        return brandMapper.findByCategory(id);
    }
}
