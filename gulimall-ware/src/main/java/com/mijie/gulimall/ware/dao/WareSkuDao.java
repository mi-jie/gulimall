package com.mijie.gulimall.ware.dao;

import com.mijie.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 18:14:33
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
