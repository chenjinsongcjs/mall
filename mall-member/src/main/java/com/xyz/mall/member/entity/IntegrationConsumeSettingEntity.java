package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分消费设置
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:13
 */
@Data
@TableName("ums_integration_consume_setting")
public class IntegrationConsumeSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "每一元需要抵扣的积分数量")
	private Integer deductionPerAmount;
		@ApiModelProperty(value = "每笔订单最高抵用百分比")
	private Integer maxPercentPerOrder;
		@ApiModelProperty(value = "每次使用积分最小单位100")
	private Integer useUnit;
		@ApiModelProperty(value = "是否可以和优惠券同用；0->不可以；1->可以")
	private Integer couponStatus;

}
