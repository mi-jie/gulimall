package com.mijie.gulimall.order.dao;

import com.mijie.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 18:08:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
