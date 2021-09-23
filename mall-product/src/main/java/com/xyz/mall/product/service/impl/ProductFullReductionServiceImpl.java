package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.ProductFullReductionDao;
import com.xyz.mall.product.entity.ProductFullReductionEntity;
import com.xyz.mall.product.service.ProductFullReductionService;


@Service("productFullReductionService")
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionDao, ProductFullReductionEntity> implements ProductFullReductionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductFullReductionEntity> page = this.page(
                new Query<ProductFullReductionEntity>().getPage(params),
                new QueryWrapper<ProductFullReductionEntity>()
        );

        return new PageUtils(page);
    }

}