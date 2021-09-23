package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券使用、领取历史表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:01
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long couponId;
		private Long memberId;
		private String couponCode;
		@ApiModelProperty(value = "领取人昵称")
	private String memberNickname;
		@ApiModelProperty(value = "获取类型：0->后台赠送；1->主动获取")
	private Integer getType;
		private Date createTime;
		@ApiModelProperty(value = "使用状态：0->未使用；1->已使用；2->已过期")
	private Integer useStatus;
		@ApiModelProperty(value = "使用时间")
	private Date useTime;
		@ApiModelProperty(value = "订单编号")
	private Long orderId;
		@ApiModelProperty(value = "订单号码")
	private String orderSn;

}
