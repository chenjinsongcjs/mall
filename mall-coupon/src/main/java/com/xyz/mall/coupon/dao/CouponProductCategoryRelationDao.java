package com.xyz.mall.coupon.dao;

import com.xyz.mall.coupon.entity.CouponProductCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券和产品分类关系表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
@Mapper
public interface CouponProductCategoryRelationDao extends BaseMapper<CouponProductCategoryRelationEntity> {
	
}
