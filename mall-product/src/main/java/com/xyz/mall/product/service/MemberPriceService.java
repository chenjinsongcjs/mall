package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:39
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

