package com.xyz.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.coupon.dao.HomeRecommendProductDao;
import com.xyz.mall.coupon.entity.HomeRecommendProductEntity;
import com.xyz.mall.coupon.service.HomeRecommendProductService;


@Service("homeRecommendProductService")
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductDao, HomeRecommendProductEntity> implements HomeRecommendProductService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeRecommendProductEntity> page = this.page(
                new Query<HomeRecommendProductEntity>().getPage(params),
                new QueryWrapper<HomeRecommendProductEntity>()
        );

        return new PageUtils(page);
    }

}