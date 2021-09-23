package com.xyz.mall.member.dao;

import com.xyz.mall.member.entity.RoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户角色表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:09
 */
@Mapper
public interface RoleDao extends BaseMapper<RoleEntity> {
	
}
