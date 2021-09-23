package com.xyz.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 运费模版
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:39
 */
@Data
@TableName("pms_feight_template")
public class FeightTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "计费类型:0->按重量；1->按件数")
	private Integer chargeType;
		@ApiModelProperty(value = "首重kg")
	private BigDecimal firstWeight;
		@ApiModelProperty(value = "首费（元）")
	private BigDecimal firstFee;
		private BigDecimal continueWeight;
		private BigDecimal continmeFee;
		@ApiModelProperty(value = "目的地（省、市）")
	private String dest;

}
