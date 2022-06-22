package com.mijie.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mijie.common.utils.PageUtils;
import com.mijie.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 15:26:49
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

