package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.HomeBrandEntity;

import java.util.Map;

/**
 * 首页推荐品牌表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:58
 */
public interface HomeBrandService extends IService<HomeBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

