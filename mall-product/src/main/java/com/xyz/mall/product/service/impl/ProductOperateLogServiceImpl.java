package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.ProductOperateLogDao;
import com.xyz.mall.product.entity.ProductOperateLogEntity;
import com.xyz.mall.product.service.ProductOperateLogService;


@Service("productOperateLogService")
public class ProductOperateLogServiceImpl extends ServiceImpl<ProductOperateLogDao, ProductOperateLogEntity> implements ProductOperateLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductOperateLogEntity> page = this.page(
                new Query<ProductOperateLogEntity>().getPage(params),
                new QueryWrapper<ProductOperateLogEntity>()
        );

        return new PageUtils(page);
    }

}