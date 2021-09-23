package com.xyz.mall.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.content.entity.TopicCategoryEntity;

import java.util.Map;

/**
 * 话题分类表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:50
 */
public interface TopicCategoryService extends IService<TopicCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

