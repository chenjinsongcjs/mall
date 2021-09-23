package com.xyz.mall.product.dao;

import com.xyz.mall.product.entity.ProductCategoryAttributeRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:36
 */
@Mapper
public interface ProductCategoryAttributeRelationDao extends BaseMapper<ProductCategoryAttributeRelationEntity> {
	
}
