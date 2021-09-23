package com.xyz.mall.order.dao;

import com.xyz.mall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:38
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
