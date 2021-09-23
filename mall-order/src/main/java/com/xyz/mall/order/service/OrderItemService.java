package com.xyz.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单中所包含的商品
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:39
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

