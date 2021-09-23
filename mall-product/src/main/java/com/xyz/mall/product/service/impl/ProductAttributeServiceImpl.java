package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.ProductAttributeDao;
import com.xyz.mall.product.entity.ProductAttributeEntity;
import com.xyz.mall.product.service.ProductAttributeService;


@Service("productAttributeService")
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeDao, ProductAttributeEntity> implements ProductAttributeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttributeEntity> page = this.page(
                new Query<ProductAttributeEntity>().getPage(params),
                new QueryWrapper<ProductAttributeEntity>()
        );

        return new PageUtils(page);
    }

}