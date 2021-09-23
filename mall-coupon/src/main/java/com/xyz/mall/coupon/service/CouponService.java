package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠卷表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:01
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

