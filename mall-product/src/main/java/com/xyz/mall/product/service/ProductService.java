package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.ProductEntity;

import java.util.Map;

/**
 * 商品信息
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:38
 */
public interface ProductService extends IService<ProductEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

