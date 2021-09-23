package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.ProductAttributeCategoryDao;
import com.xyz.mall.product.entity.ProductAttributeCategoryEntity;
import com.xyz.mall.product.service.ProductAttributeCategoryService;


@Service("productAttributeCategoryService")
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryDao, ProductAttributeCategoryEntity> implements ProductAttributeCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttributeCategoryEntity> page = this.page(
                new Query<ProductAttributeCategoryEntity>().getPage(params),
                new QueryWrapper<ProductAttributeCategoryEntity>()
        );

        return new PageUtils(page);
    }

}