package com.xyz.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:40
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

