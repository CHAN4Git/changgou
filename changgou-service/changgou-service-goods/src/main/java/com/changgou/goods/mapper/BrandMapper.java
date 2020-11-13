package com.changgou.goods.mapper;

import com.changgou.goods.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface BrandMapper extends Mapper<Brand> {

    /**
     * 根据类别ID查询品牌列表
     * @param id
     * @return
     */

    @Select("select b.* from tb_brand b,tb_category_brand cb where b.id = cb.brand_id and cb.category_id = #{id}")
   List<Brand> findByCategory(Integer id);
}
