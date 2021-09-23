package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.PrefrenceAreaProductRelationDao;
import com.xyz.mall.content.entity.PrefrenceAreaProductRelationEntity;
import com.xyz.mall.content.service.PrefrenceAreaProductRelationService;


@Service("prefrenceAreaProductRelationService")
public class PrefrenceAreaProductRelationServiceImpl extends ServiceImpl<PrefrenceAreaProductRelationDao, PrefrenceAreaProductRelationEntity> implements PrefrenceAreaProductRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PrefrenceAreaProductRelationEntity> page = this.page(
                new Query<PrefrenceAreaProductRelationEntity>().getPage(params),
                new QueryWrapper<PrefrenceAreaProductRelationEntity>()
        );

        return new PageUtils(page);
    }

}