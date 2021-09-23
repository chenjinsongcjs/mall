package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import lombok.Data;

/**
 * 限时购场次表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
@Data
@TableName("sms_flash_promotion_session")
public class FlashPromotionSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		@ApiModelProperty(value = "编号")
	private Long id;
		@ApiModelProperty(value = "场次名称")
	private String name;
		@ApiModelProperty(value = "每日开始时间")
	private Time startTime;
		@ApiModelProperty(value = "每日结束时间")
	private Time endTime;
		@ApiModelProperty(value = "启用状态：0->不启用；1->启用")
	private Integer status;
		@ApiModelProperty(value = "创建时间")
	private Date createTime;

}
