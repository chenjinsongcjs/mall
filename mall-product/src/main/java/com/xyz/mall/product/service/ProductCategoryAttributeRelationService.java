package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.ProductCategoryAttributeRelationEntity;

import java.util.Map;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:36
 */
public interface ProductCategoryAttributeRelationService extends IService<ProductCategoryAttributeRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

