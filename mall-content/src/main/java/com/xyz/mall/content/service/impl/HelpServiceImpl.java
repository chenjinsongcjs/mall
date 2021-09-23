package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.HelpDao;
import com.xyz.mall.content.entity.HelpEntity;
import com.xyz.mall.content.service.HelpService;


@Service("helpService")
public class HelpServiceImpl extends ServiceImpl<HelpDao, HelpEntity> implements HelpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HelpEntity> page = this.page(
                new Query<HelpEntity>().getPage(params),
                new QueryWrapper<HelpEntity>()
        );

        return new PageUtils(page);
    }

}