package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.HomeRecommendProductEntity;

import java.util.Map;

/**
 * 人气推荐商品表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:57
 */
public interface HomeRecommendProductService extends IService<HomeRecommendProductEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

