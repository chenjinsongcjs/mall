package com.xyz.mall.product.dao;

import com.xyz.mall.product.entity.ProductAttributeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性参数表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:38
 */
@Mapper
public interface ProductAttributeDao extends BaseMapper<ProductAttributeEntity> {
	
}
