package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户角色表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:09
 */
@Data
@TableName("ums_role")
public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "名称")
	private String name;
		@ApiModelProperty(value = "描述")
	private String description;
		@ApiModelProperty(value = "后台用户数量")
	private Integer adminCount;
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
		@ApiModelProperty(value = "启用状态：0->禁用；1->启用")
	private Integer status;
		private Integer sort;

}
