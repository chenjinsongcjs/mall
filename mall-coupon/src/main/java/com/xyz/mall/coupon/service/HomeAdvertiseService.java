package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.HomeAdvertiseEntity;

import java.util.Map;

/**
 * 首页轮播广告表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:58
 */
public interface HomeAdvertiseService extends IService<HomeAdvertiseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

