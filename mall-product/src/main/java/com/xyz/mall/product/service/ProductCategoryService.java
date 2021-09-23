package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.ProductCategoryEntity;

import java.util.Map;

/**
 * 产品分类
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
public interface ProductCategoryService extends IService<ProductCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

