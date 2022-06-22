package com.mijie.gulimall.product.dao;

import com.mijie.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-21 15:58:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
