package com.xyz.mall.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 专题表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:51
 */
@Data
@TableName("cms_subject")
public class SubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long categoryId;
		private String title;
		@ApiModelProperty(value = "专题主图")
	private String pic;
		@ApiModelProperty(value = "关联产品数量")
	private Integer productCount;
		private Integer recommendStatus;
		private Date createTime;
		private Integer collectCount;
		private Integer readCount;
		private Integer commentCount;
		@ApiModelProperty(value = "画册图片用逗号分割")
	private String albumPics;
		private String description;
		@ApiModelProperty(value = "显示状态：0->不显示；1->显示")
	private Integer showStatus;
		private String content;
		@ApiModelProperty(value = "转发数")
	private Integer forwardCount;
		@ApiModelProperty(value = "专题分类名称")
	private String categoryName;

}
