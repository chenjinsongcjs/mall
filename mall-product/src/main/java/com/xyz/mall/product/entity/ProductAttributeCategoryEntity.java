package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品属性分类表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Data
@TableName("pms_product_attribute_category")
public class ProductAttributeCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "属性数量")
	private Integer attributeCount;
		@ApiModelProperty(value = "参数数量")
	private Integer paramCount;

}
