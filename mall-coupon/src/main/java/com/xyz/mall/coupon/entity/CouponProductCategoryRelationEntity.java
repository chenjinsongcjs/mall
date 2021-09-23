package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券和产品分类关系表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
@Data
@TableName("sms_coupon_product_category_relation")
public class CouponProductCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long couponId;
		private Long productCategoryId;
		@ApiModelProperty(value = "产品分类名称")
	private String productCategoryName;
		@ApiModelProperty(value = "父分类名称")
	private String parentCategoryName;

}
