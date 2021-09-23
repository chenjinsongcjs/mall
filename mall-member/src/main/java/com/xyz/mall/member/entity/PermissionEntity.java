package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户权限表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:09
 */
@Data
@TableName("ums_permission")
public class PermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		@ApiModelProperty(value = "父级权限id")
	private Long pid;
		@ApiModelProperty(value = "名称")
	private String name;
		@ApiModelProperty(value = "权限值")
	private String value;
		@ApiModelProperty(value = "图标")
	private String icon;
		@ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
	private Integer type;
		@ApiModelProperty(value = "前端资源路径")
	private String uri;
		@ApiModelProperty(value = "启用状态；0->禁用；1->启用")
	private Integer status;
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
		@ApiModelProperty(value = "排序")
	private Integer sort;

}
