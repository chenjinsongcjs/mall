package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.SubjectProductRelationDao;
import com.xyz.mall.content.entity.SubjectProductRelationEntity;
import com.xyz.mall.content.service.SubjectProductRelationService;


@Service("subjectProductRelationService")
public class SubjectProductRelationServiceImpl extends ServiceImpl<SubjectProductRelationDao, SubjectProductRelationEntity> implements SubjectProductRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SubjectProductRelationEntity> page = this.page(
                new Query<SubjectProductRelationEntity>().getPage(params),
                new QueryWrapper<SubjectProductRelationEntity>()
        );

        return new PageUtils(page);
    }

}