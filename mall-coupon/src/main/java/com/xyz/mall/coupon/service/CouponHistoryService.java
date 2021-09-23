package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券使用、领取历史表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:01
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

