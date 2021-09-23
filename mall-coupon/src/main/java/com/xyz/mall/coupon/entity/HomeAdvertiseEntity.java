package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页轮播广告表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:58
 */
@Data
@TableName("sms_home_advertise")
public class HomeAdvertiseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "轮播位置：0->PC首页轮播；1->app首页轮播")
	private Integer type;
		private String pic;
		private Date startTime;
		private Date endTime;
		@ApiModelProperty(value = "上下线状态：0->下线；1->上线")
	private Integer status;
		@ApiModelProperty(value = "点击数")
	private Integer clickCount;
		@ApiModelProperty(value = "下单数")
	private Integer orderCount;
		@ApiModelProperty(value = "链接地址")
	private String url;
		@ApiModelProperty(value = "备注")
	private String note;
		@ApiModelProperty(value = "排序")
	private Integer sort;

}
