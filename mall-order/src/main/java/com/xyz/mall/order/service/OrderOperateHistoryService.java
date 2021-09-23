package com.xyz.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:39
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

