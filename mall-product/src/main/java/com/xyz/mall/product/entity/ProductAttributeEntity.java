package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品属性参数表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:38
 */
@Data
@TableName("pms_product_attribute")
public class ProductAttributeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productAttributeCategoryId;
		private String name;
		@ApiModelProperty(value = "属性选择类型：0->唯一；1->单选；2->多选")
	private Integer selectType;
		@ApiModelProperty(value = "属性录入方式：0->手工录入；1->从列表中选取")
	private Integer inputType;
		@ApiModelProperty(value = "可选值列表，以逗号隔开")
	private String inputList;
		@ApiModelProperty(value = "排序字段：最高的可以单独上传图片")
	private Integer sort;
		@ApiModelProperty(value = "分类筛选样式：1->普通；1->颜色")
	private Integer filterType;
		@ApiModelProperty(value = "检索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
	private Integer searchType;
		@ApiModelProperty(value = "相同属性产品是否关联；0->不关联；1->关联")
	private Integer relatedStatus;
		@ApiModelProperty(value = "是否支持手动新增；0->不支持；1->支持")
	private Integer handAddStatus;
		@ApiModelProperty(value = "属性的类型；0->规格；1->参数")
	private Integer type;

}
