package com.xyz.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:38
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

