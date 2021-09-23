package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.SubjectDao;
import com.xyz.mall.content.entity.SubjectEntity;
import com.xyz.mall.content.service.SubjectService;


@Service("subjectService")
public class SubjectServiceImpl extends ServiceImpl<SubjectDao, SubjectEntity> implements SubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SubjectEntity> page = this.page(
                new Query<SubjectEntity>().getPage(params),
                new QueryWrapper<SubjectEntity>()
        );

        return new PageUtils(page);
    }

}