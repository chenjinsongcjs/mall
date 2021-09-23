package com.xyz.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退货原因表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:38
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "退货类型")
	private String name;
		private Integer sort;
		@ApiModelProperty(value = "状态：0->不启用；1->启用")
	private Integer status;
		@ApiModelProperty(value = "添加时间")
	private Date createTime;

}
