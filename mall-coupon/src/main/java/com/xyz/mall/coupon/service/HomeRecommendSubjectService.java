package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.HomeRecommendSubjectEntity;

import java.util.Map;

/**
 * 首页推荐专题表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:57
 */
public interface HomeRecommendSubjectService extends IService<HomeRecommendSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

