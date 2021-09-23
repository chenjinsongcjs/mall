package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.FeightTemplateDao;
import com.xyz.mall.product.entity.FeightTemplateEntity;
import com.xyz.mall.product.service.FeightTemplateService;


@Service("feightTemplateService")
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateDao, FeightTemplateEntity> implements FeightTemplateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FeightTemplateEntity> page = this.page(
                new Query<FeightTemplateEntity>().getPage(params),
                new QueryWrapper<FeightTemplateEntity>()
        );

        return new PageUtils(page);
    }

}