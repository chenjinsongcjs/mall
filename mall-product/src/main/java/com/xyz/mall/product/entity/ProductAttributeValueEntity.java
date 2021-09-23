package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 存储产品参数信息的表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Data
@TableName("pms_product_attribute_value")
public class ProductAttributeValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		private Long productAttributeId;
		@ApiModelProperty(value = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
	private String value;

}
