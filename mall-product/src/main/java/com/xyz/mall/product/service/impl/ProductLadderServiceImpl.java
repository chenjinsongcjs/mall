package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.ProductLadderDao;
import com.xyz.mall.product.entity.ProductLadderEntity;
import com.xyz.mall.product.service.ProductLadderService;


@Service("productLadderService")
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderDao, ProductLadderEntity> implements ProductLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductLadderEntity> page = this.page(
                new Query<ProductLadderEntity>().getPage(params),
                new QueryWrapper<ProductLadderEntity>()
        );

        return new PageUtils(page);
    }

}