package com.mijie.gulimall.member.dao;

import com.mijie.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mije
 * @email mijie@gmail.com
 * @date 2022-06-22 17:55:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
