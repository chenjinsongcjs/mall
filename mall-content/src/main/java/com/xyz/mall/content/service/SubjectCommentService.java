package com.xyz.mall.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.content.entity.SubjectCommentEntity;

import java.util.Map;

/**
 * 专题评论表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:50
 */
public interface SubjectCommentService extends IService<SubjectCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

