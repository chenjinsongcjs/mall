package com.xyz.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.coupon.dao.HomeNewProductDao;
import com.xyz.mall.coupon.entity.HomeNewProductEntity;
import com.xyz.mall.coupon.service.HomeNewProductService;


@Service("homeNewProductService")
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductDao, HomeNewProductEntity> implements HomeNewProductService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeNewProductEntity> page = this.page(
                new Query<HomeNewProductEntity>().getPage(params),
                new QueryWrapper<HomeNewProductEntity>()
        );

        return new PageUtils(page);
    }

}