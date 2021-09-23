package com.xyz.mall.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 帮助分类表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:53
 */
@Data
@TableName("cms_help_category")
public class HelpCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "分类图标")
	private String icon;
		@ApiModelProperty(value = "专题数量")
	private Integer helpCount;
		private Integer showStatus;
		private Integer sort;

}
