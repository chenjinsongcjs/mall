package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.TopicCommentDao;
import com.xyz.mall.content.entity.TopicCommentEntity;
import com.xyz.mall.content.service.TopicCommentService;


@Service("topicCommentService")
public class TopicCommentServiceImpl extends ServiceImpl<TopicCommentDao, TopicCommentEntity> implements TopicCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TopicCommentEntity> page = this.page(
                new Query<TopicCommentEntity>().getPage(params),
                new QueryWrapper<TopicCommentEntity>()
        );

        return new PageUtils(page);
    }

}