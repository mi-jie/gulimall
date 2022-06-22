package com.mijie.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mijie.common.utils.PageUtils;
import com.mijie.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 18:08:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

