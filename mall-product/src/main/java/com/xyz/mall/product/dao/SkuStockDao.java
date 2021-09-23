package com.xyz.mall.product.dao;

import com.xyz.mall.product.entity.SkuStockEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku的库存
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:34
 */
@Mapper
public interface SkuStockDao extends BaseMapper<SkuStockEntity> {
	
}
