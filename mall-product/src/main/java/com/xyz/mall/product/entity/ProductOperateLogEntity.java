package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:35
 */
@Data
@TableName("pms_product_operate_log")
public class ProductOperateLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		private BigDecimal priceOld;
		private BigDecimal priceNew;
		private BigDecimal salePriceOld;
		private BigDecimal salePriceNew;
		@ApiModelProperty(value = "赠送的积分")
	private Integer giftPointOld;
		private Integer giftPointNew;
		private Integer usePointLimitOld;
		private Integer usePointLimitNew;
		@ApiModelProperty(value = "操作人")
	private String operateMan;
		private Date createTime;

}
