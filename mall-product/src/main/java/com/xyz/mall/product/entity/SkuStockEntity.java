package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku的库存
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:34
 */
@Data
@TableName("pms_sku_stock")
public class SkuStockEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		@ApiModelProperty(value = "sku编码")
	private String skuCode;
		private BigDecimal price;
		@ApiModelProperty(value = "库存")
	private Integer stock;
		@ApiModelProperty(value = "预警库存")
	private Integer lowStock;
		@ApiModelProperty(value = "销售属性1")
	private String sp1;
		private String sp2;
		private String sp3;
		@ApiModelProperty(value = "展示图片")
	private String pic;
		@ApiModelProperty(value = "销量")
	private Integer sale;
		@ApiModelProperty(value = "单品促销价格")
	private BigDecimal promotionPrice;
		@ApiModelProperty(value = "锁定库存")
	private Integer lockStock;

}
