package com.xyz.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.coupon.dao.HomeRecommendSubjectDao;
import com.xyz.mall.coupon.entity.HomeRecommendSubjectEntity;
import com.xyz.mall.coupon.service.HomeRecommendSubjectService;


@Service("homeRecommendSubjectService")
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectDao, HomeRecommendSubjectEntity> implements HomeRecommendSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeRecommendSubjectEntity> page = this.page(
                new Query<HomeRecommendSubjectEntity>().getPage(params),
                new QueryWrapper<HomeRecommendSubjectEntity>()
        );

        return new PageUtils(page);
    }

}