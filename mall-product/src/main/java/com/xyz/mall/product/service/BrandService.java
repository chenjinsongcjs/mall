package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:40
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

