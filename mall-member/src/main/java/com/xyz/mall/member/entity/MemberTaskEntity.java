package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员任务表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:09
 */
@Data
@TableName("ums_member_task")
public class MemberTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private String name;
		@ApiModelProperty(value = "赠送成长值")
	private Integer growth;
		@ApiModelProperty(value = "赠送积分")
	private Integer intergration;
		@ApiModelProperty(value = "任务类型：0->新手任务；1->日常任务")
	private Integer type;

}
