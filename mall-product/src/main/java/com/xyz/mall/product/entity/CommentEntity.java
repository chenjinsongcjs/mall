package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:40
 */
@Data
@TableName("pms_comment")
public class CommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		private String memberNickName;
		private String productName;
		@ApiModelProperty(value = "评价星数：0->5")
	private Integer star;
		@ApiModelProperty(value = "评价的ip")
	private String memberIp;
		private Date createTime;
		private Integer showStatus;
		@ApiModelProperty(value = "购买时的商品属性")
	private String productAttribute;
		private Integer collectCouont;
		private Integer readCount;
		private String content;
		@ApiModelProperty(value = "上传图片地址，以逗号隔开")
	private String pics;
		@ApiModelProperty(value = "评论用户头像")
	private String memberIcon;
		private Integer replayCount;

}
