package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
@Data
@TableName("ums_admin")
public class AdminEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String username;
		private String password;
		@ApiModelProperty(value = "头像")
	private String icon;
		@ApiModelProperty(value = "邮箱")
	private String email;
		@ApiModelProperty(value = "昵称")
	private String nickName;
		@ApiModelProperty(value = "备注信息")
	private String note;
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
		@ApiModelProperty(value = "最后登录时间")
	private Date loginTime;
		@ApiModelProperty(value = "帐号启用状态：0->禁用；1->启用")
	private Integer status;

}
