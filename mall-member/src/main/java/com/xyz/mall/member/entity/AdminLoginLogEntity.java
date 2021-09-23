package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户登录日志表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
@Data
@TableName("ums_admin_login_log")
public class AdminLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long adminId;
		private Date createTime;
		private String ip;
		private String address;
		@ApiModelProperty(value = "浏览器登录类型")
	private String userAgent;

}
