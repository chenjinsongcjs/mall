package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.SkuStockEntity;

import java.util.Map;

/**
 * sku的库存
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:34
 */
public interface SkuStockService extends IService<SkuStockEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

