package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.ProductAttributeValueEntity;

import java.util.Map;

/**
 * 存储产品参数信息的表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
public interface ProductAttributeValueService extends IService<ProductAttributeValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

