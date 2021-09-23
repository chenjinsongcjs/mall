package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.TopicCategoryDao;
import com.xyz.mall.content.entity.TopicCategoryEntity;
import com.xyz.mall.content.service.TopicCategoryService;


@Service("topicCategoryService")
public class TopicCategoryServiceImpl extends ServiceImpl<TopicCategoryDao, TopicCategoryEntity> implements TopicCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TopicCategoryEntity> page = this.page(
                new Query<TopicCategoryEntity>().getPage(params),
                new QueryWrapper<TopicCategoryEntity>()
        );

        return new PageUtils(page);
    }

}