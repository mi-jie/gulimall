package com.mijie.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mijie.common.utils.PageUtils;
import com.mijie.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 18:08:48
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

