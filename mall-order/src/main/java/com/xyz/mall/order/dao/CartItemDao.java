package com.xyz.mall.order.dao;

import com.xyz.mall.order.entity.CartItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物车表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:40
 */
@Mapper
public interface CartItemDao extends BaseMapper<CartItemEntity> {
	
}
