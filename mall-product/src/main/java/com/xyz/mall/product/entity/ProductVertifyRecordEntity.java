package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品审核记录
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:35
 */
@Data
@TableName("pms_product_vertify_record")
public class ProductVertifyRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		private Date createTime;
		@ApiModelProperty(value = "审核人")
	private String vertifyMan;
		private Integer status;
		@ApiModelProperty(value = "反馈详情")
	private String detail;

}
