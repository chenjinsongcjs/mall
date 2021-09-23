package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.SubjectCategoryDao;
import com.xyz.mall.content.entity.SubjectCategoryEntity;
import com.xyz.mall.content.service.SubjectCategoryService;


@Service("subjectCategoryService")
public class SubjectCategoryServiceImpl extends ServiceImpl<SubjectCategoryDao, SubjectCategoryEntity> implements SubjectCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SubjectCategoryEntity> page = this.page(
                new Query<SubjectCategoryEntity>().getPage(params),
                new QueryWrapper<SubjectCategoryEntity>()
        );

        return new PageUtils(page);
    }

}