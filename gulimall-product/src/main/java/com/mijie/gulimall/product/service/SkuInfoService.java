package com.mijie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mijie.common.utils.PageUtils;
import com.mijie.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-21 15:58:39
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

