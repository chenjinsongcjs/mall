package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.PrefrenceAreaDao;
import com.xyz.mall.content.entity.PrefrenceAreaEntity;
import com.xyz.mall.content.service.PrefrenceAreaService;


@Service("prefrenceAreaService")
public class PrefrenceAreaServiceImpl extends ServiceImpl<PrefrenceAreaDao, PrefrenceAreaEntity> implements PrefrenceAreaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PrefrenceAreaEntity> page = this.page(
                new Query<PrefrenceAreaEntity>().getPage(params),
                new QueryWrapper<PrefrenceAreaEntity>()
        );

        return new PageUtils(page);
    }

}