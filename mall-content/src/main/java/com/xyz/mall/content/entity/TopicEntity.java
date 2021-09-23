package com.xyz.mall.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 话题表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:50
 */
@Data
@TableName("cms_topic")
public class TopicEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long categoryId;
		private String name;
		private Date createTime;
		private Date startTime;
		private Date endTime;
		@ApiModelProperty(value = "参与人数")
	private Integer attendCount;
		@ApiModelProperty(value = "关注人数")
	private Integer attentionCount;
		private Integer readCount;
		@ApiModelProperty(value = "奖品名称")
	private String awardName;
		@ApiModelProperty(value = "参与方式")
	private String attendType;
		@ApiModelProperty(value = "话题内容")
	private String content;

}
