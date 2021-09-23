package com.xyz.mall.member.dao;

import com.xyz.mall.member.entity.MemberProductCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:12
 */
@Mapper
public interface MemberProductCategoryRelationDao extends BaseMapper<MemberProductCategoryRelationEntity> {
	
}
