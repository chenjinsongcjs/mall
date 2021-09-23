package com.xyz.mall.content.dao;

import com.xyz.mall.content.entity.MemberReportEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户举报表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:52
 */
@Mapper
public interface MemberReportDao extends BaseMapper<MemberReportEntity> {
	
}
