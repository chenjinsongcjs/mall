package com.xyz.mall.member.dao;

import com.xyz.mall.member.entity.AdminRoleRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户和角色关系表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:14
 */
@Mapper
public interface AdminRoleRelationDao extends BaseMapper<AdminRoleRelationEntity> {
	
}
