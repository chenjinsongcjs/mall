package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品分类
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Data
@TableName("pms_product_category")
public class ProductCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "上机分类的编号：0表示一级分类")
	private Long parentId;
		private String name;
		@ApiModelProperty(value = "分类级别：0->1级；1->2级")
	private Integer level;
		private Integer productCount;
		private String productUnit;
		@ApiModelProperty(value = "是否显示在导航栏：0->不显示；1->显示")
	private Integer navStatus;
		@ApiModelProperty(value = "显示状态：0->不显示；1->显示")
	private Integer showStatus;
		private Integer sort;
		@ApiModelProperty(value = "图标")
	private String icon;
		private String keywords;
		@ApiModelProperty(value = "描述")
	private String description;

}
