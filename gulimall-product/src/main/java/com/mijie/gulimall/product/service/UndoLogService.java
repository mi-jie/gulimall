package com.mijie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mijie.common.utils.PageUtils;
import com.mijie.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-21 15:58:39
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

