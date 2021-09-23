package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收货地址表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:11
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long memberId;
		@ApiModelProperty(value = "收货人名称")
	private String name;
		private String phoneNumber;
		@ApiModelProperty(value = "是否为默认")
	private Integer defaultStatus;
		@ApiModelProperty(value = "邮政编码")
	private String postCode;
		@ApiModelProperty(value = "省份/直辖市")
	private String province;
		@ApiModelProperty(value = "城市")
	private String city;
		@ApiModelProperty(value = "区")
	private String region;
		@ApiModelProperty(value = "详细地址(街道)")
	private String detailAddress;

}
