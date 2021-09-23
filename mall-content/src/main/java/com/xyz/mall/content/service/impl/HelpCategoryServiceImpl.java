package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.HelpCategoryDao;
import com.xyz.mall.content.entity.HelpCategoryEntity;
import com.xyz.mall.content.service.HelpCategoryService;


@Service("helpCategoryService")
public class HelpCategoryServiceImpl extends ServiceImpl<HelpCategoryDao, HelpCategoryEntity> implements HelpCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HelpCategoryEntity> page = this.page(
                new Query<HelpCategoryEntity>().getPage(params),
                new QueryWrapper<HelpCategoryEntity>()
        );

        return new PageUtils(page);
    }

}