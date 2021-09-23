package com.xyz.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.coupon.dao.FlashPromotionDao;
import com.xyz.mall.coupon.entity.FlashPromotionEntity;
import com.xyz.mall.coupon.service.FlashPromotionService;


@Service("flashPromotionService")
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionDao, FlashPromotionEntity> implements FlashPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionEntity> page = this.page(
                new Query<FlashPromotionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionEntity>()
        );

        return new PageUtils(page);
    }

}