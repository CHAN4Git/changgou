package com.changgou.goods.controller;


import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import com.changgou.utils.Result;
import com.changgou.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    BrandService brandService;

    @RequestMapping("/category/{id}")
    public Result findByCategory(@PathVariable(value = "id") Integer id){
        List<Brand> brandList = brandService.findByCategory(id);
        return new Result<List<Brand>>(true, StatusCode.OK,"查询成功",brandList);
    }
}
