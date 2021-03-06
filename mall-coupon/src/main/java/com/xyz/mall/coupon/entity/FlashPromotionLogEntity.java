package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 限时购通知记录
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
@Data
@TableName("sms_flash_promotion_log")
public class FlashPromotionLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Integer id;
		private Integer memberId;
		private Long productId;
		private String memberPhone;
		private String productName;
		@ApiModelProperty(value = "会员订阅时间")
	private Date subscribeTime;
		private Date sendTime;

}
