package com.xyz.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 成长值变化历史记录表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:14
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long memberId;
		private Date createTime;
		@ApiModelProperty(value = "改变类型：0->增加；1->减少")
	private Integer changeType;
		@ApiModelProperty(value = "积分改变数量")
	private Integer changeCount;
		@ApiModelProperty(value = "操作人员")
	private String operateMan;
		@ApiModelProperty(value = "操作备注")
	private String operateNote;
		@ApiModelProperty(value = "积分来源：0->购物；1->管理员修改")
	private Integer sourceType;

}
