package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.ProductOperateLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:35
 */
public interface ProductOperateLogService extends IService<ProductOperateLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

