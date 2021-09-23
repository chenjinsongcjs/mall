package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.ProductCategoryAttributeRelationDao;
import com.xyz.mall.product.entity.ProductCategoryAttributeRelationEntity;
import com.xyz.mall.product.service.ProductCategoryAttributeRelationService;


@Service("productCategoryAttributeRelationService")
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationDao, ProductCategoryAttributeRelationEntity> implements ProductCategoryAttributeRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductCategoryAttributeRelationEntity> page = this.page(
                new Query<ProductCategoryAttributeRelationEntity>().getPage(params),
                new QueryWrapper<ProductCategoryAttributeRelationEntity>()
        );

        return new PageUtils(page);
    }

}