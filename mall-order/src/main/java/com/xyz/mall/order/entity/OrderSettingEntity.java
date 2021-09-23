package com.xyz.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单设置表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:38
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "秒杀订单超时关闭时间(分)")
	private Integer flashOrderOvertime;
		@ApiModelProperty(value = "正常订单超时时间(分)")
	private Integer normalOrderOvertime;
		@ApiModelProperty(value = "发货后自动确认收货时间（天）")
	private Integer confirmOvertime;
		@ApiModelProperty(value = "自动完成交易时间，不能申请售后（天）")
	private Integer finishOvertime;
		@ApiModelProperty(value = "订单完成后自动好评时间（天）")
	private Integer commentOvertime;

}
