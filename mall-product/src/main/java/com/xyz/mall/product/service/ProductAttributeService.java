package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.ProductAttributeEntity;

import java.util.Map;

/**
 * 商品属性参数表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:38
 */
public interface ProductAttributeService extends IService<ProductAttributeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

