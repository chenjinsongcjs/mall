package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 限时购表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
@Data
@TableName("sms_flash_promotion")
public class FlashPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String title;
		@ApiModelProperty(value = "开始日期")
	private Date startDate;
		@ApiModelProperty(value = "结束日期")
	private Date endDate;
		@ApiModelProperty(value = "上下线状态")
	private Integer status;
		@ApiModelProperty(value = "秒杀时间段名称")
	private Date createTime;

}
