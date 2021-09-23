package com.xyz.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.coupon.dao.CouponProductRelationDao;
import com.xyz.mall.coupon.entity.CouponProductRelationEntity;
import com.xyz.mall.coupon.service.CouponProductRelationService;


@Service("couponProductRelationService")
public class CouponProductRelationServiceImpl extends ServiceImpl<CouponProductRelationDao, CouponProductRelationEntity> implements CouponProductRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponProductRelationEntity> page = this.page(
                new Query<CouponProductRelationEntity>().getPage(params),
                new QueryWrapper<CouponProductRelationEntity>()
        );

        return new PageUtils(page);
    }

}