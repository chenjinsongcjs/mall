package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:40
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "首字母")
	private String firstLetter;
		private Integer sort;
		@ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
	private Integer factoryStatus;
		private Integer showStatus;
		@ApiModelProperty(value = "产品数量")
	private Integer productCount;
		@ApiModelProperty(value = "产品评论数量")
	private Integer productCommentCount;
		@ApiModelProperty(value = "品牌logo")
	private String logo;
		@ApiModelProperty(value = "专区大图")
	private String bigPic;
		@ApiModelProperty(value = "品牌故事")
	private String brandStory;

}
