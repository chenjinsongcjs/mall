package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠卷表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:01
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
	private Integer type;
		private String name;
		@ApiModelProperty(value = "使用平台：0->全部；1->移动；2->PC")
	private Integer platform;
		@ApiModelProperty(value = "数量")
	private Integer count;
		@ApiModelProperty(value = "金额")
	private BigDecimal amount;
		@ApiModelProperty(value = "每人限领张数")
	private Integer perLimit;
		@ApiModelProperty(value = "使用门槛；0表示无门槛")
	private BigDecimal minPoint;
		private Date startTime;
		private Date endTime;
		@ApiModelProperty(value = "使用类型：0->全场通用；1->指定分类；2->指定商品")
	private Integer useType;
		@ApiModelProperty(value = "备注")
	private String note;
		@ApiModelProperty(value = "发行数量")
	private Integer publishCount;
		@ApiModelProperty(value = "已使用数量")
	private Integer useCount;
		@ApiModelProperty(value = "领取数量")
	private Integer receiveCount;
		@ApiModelProperty(value = "可以领取的日期")
	private Date enableTime;
		@ApiModelProperty(value = "优惠码")
	private String code;
		@ApiModelProperty(value = "可领取的会员类型：0->无限时")
	private Integer memberLevel;

}
