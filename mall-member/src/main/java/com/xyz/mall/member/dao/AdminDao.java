package com.xyz.mall.member.dao;

import com.xyz.mall.member.entity.AdminEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
@Mapper
public interface AdminDao extends BaseMapper<AdminEntity> {
	
}
