package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品限时购与商品关系表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
@Data
@TableName("sms_flash_promotion_product_relation")
public class FlashPromotionProductRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		@ApiModelProperty(value = "编号")
	private Long id;
		private Long flashPromotionId;
		@ApiModelProperty(value = "编号")
	private Long flashPromotionSessionId;
		private Long productId;
		@ApiModelProperty(value = "限时购价格")
	private BigDecimal flashPromotionPrice;
		@ApiModelProperty(value = "限时购数量")
	private Integer flashPromotionCount;
		@ApiModelProperty(value = "每人限购数量")
	private Integer flashPromotionLimit;
		@ApiModelProperty(value = "排序")
	private Integer sort;

}
