package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户标签表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:10
 */
@Data
@TableName("ums_member_tag")
public class MemberTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "自动打标签完成订单数量")
	private Integer finishOrderCount;
		@ApiModelProperty(value = "自动打标签完成订单金额")
	private BigDecimal finishOrderAmount;

}
