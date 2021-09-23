package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.SubjectCommentDao;
import com.xyz.mall.content.entity.SubjectCommentEntity;
import com.xyz.mall.content.service.SubjectCommentService;


@Service("subjectCommentService")
public class SubjectCommentServiceImpl extends ServiceImpl<SubjectCommentDao, SubjectCommentEntity> implements SubjectCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SubjectCommentEntity> page = this.page(
                new Query<SubjectCommentEntity>().getPage(params),
                new QueryWrapper<SubjectCommentEntity>()
        );

        return new PageUtils(page);
    }

}