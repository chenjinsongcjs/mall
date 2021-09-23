package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.SkuStockDao;
import com.xyz.mall.product.entity.SkuStockEntity;
import com.xyz.mall.product.service.SkuStockService;


@Service("skuStockService")
public class SkuStockServiceImpl extends ServiceImpl<SkuStockDao, SkuStockEntity> implements SkuStockService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuStockEntity> page = this.page(
                new Query<SkuStockEntity>().getPage(params),
                new QueryWrapper<SkuStockEntity>()
        );

        return new PageUtils(page);
    }

}