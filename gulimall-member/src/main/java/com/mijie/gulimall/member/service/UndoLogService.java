package com.mijie.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mijie.common.utils.PageUtils;
import com.mijie.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 17:55:36
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

