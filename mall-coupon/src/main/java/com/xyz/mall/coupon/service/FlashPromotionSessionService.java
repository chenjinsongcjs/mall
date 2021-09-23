package com.xyz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.coupon.entity.FlashPromotionSessionEntity;

import java.util.Map;

/**
 * 限时购场次表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
public interface FlashPromotionSessionService extends IService<FlashPromotionSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

