package com.xyz.mall.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 专题评论表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:50
 */
@Data
@TableName("cms_subject_comment")
public class SubjectCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long subjectId;
		private String memberNickName;
		private String memberIcon;
		private String content;
		private Date createTime;
		private Integer showStatus;

}
