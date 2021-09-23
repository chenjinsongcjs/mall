package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.CouponProductCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券和产品分类关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
public interface CouponProductCategoryRelationService extends IService<CouponProductCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

