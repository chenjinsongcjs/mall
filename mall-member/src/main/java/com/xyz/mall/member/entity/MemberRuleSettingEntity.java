package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员积分成长规则表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:10
 */
@Data
@TableName("ums_member_rule_setting")
public class MemberRuleSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "连续签到天数")
	private Integer continueSignDay;
		@ApiModelProperty(value = "连续签到赠送数量")
	private Integer continueSignPoint;
		@ApiModelProperty(value = "每消费多少元获取1个点")
	private BigDecimal consumePerPoint;
		@ApiModelProperty(value = "最低获取点数的订单金额")
	private BigDecimal lowOrderAmount;
		@ApiModelProperty(value = "每笔订单最高获取点数")
	private Integer maxPointPerOrder;
		@ApiModelProperty(value = "类型：0->积分规则；1->成长值规则")
	private Integer type;

}
