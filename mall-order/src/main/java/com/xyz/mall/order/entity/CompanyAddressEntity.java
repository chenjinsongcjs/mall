package com.xyz.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公司收发货地址表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:40
 */
@Data
@TableName("oms_company_address")
public class CompanyAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "地址名称")
	private String addressName;
		@ApiModelProperty(value = "默认发货地址：0->否；1->是")
	private Integer sendStatus;
		@ApiModelProperty(value = "是否默认收货地址：0->否；1->是")
	private Integer receiveStatus;
		@ApiModelProperty(value = "收发货人姓名")
	private String name;
		@ApiModelProperty(value = "收货人电话")
	private String phone;
		@ApiModelProperty(value = "省/直辖市")
	private String province;
		@ApiModelProperty(value = "市")
	private String city;
		@ApiModelProperty(value = "区")
	private String region;
		@ApiModelProperty(value = "详细地址")
	private String detailAddress;

}
