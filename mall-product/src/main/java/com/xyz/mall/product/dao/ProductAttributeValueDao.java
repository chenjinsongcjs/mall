package com.xyz.mall.product.dao;

import com.xyz.mall.product.entity.ProductAttributeValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 存储产品参数信息的表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Mapper
public interface ProductAttributeValueDao extends BaseMapper<ProductAttributeValueEntity> {
	
}
