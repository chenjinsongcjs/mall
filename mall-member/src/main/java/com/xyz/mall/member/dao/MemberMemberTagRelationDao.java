package com.xyz.mall.member.dao;

import com.xyz.mall.member.entity.MemberMemberTagRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户和标签关系表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:11
 */
@Mapper
public interface MemberMemberTagRelationDao extends BaseMapper<MemberMemberTagRelationEntity> {
	
}
