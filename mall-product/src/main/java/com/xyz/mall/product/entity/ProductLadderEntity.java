package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品阶梯价格表(只针对同商品)
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:36
 */
@Data
@TableName("pms_product_ladder")
public class ProductLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		@ApiModelProperty(value = "满足的商品数量")
	private Integer count;
		@ApiModelProperty(value = "折扣")
	private BigDecimal discount;
		@ApiModelProperty(value = "折后价格")
	private BigDecimal price;

}
