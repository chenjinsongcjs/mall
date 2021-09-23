package com.xyz.mall.coupon.dao;

import com.xyz.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠卷表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
