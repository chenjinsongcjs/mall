package com.xyz.mall.product.dao;

import com.xyz.mall.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:40
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
