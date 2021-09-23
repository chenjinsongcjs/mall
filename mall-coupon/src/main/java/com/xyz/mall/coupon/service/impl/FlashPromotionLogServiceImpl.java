package com.xyz.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.coupon.dao.FlashPromotionLogDao;
import com.xyz.mall.coupon.entity.FlashPromotionLogEntity;
import com.xyz.mall.coupon.service.FlashPromotionLogService;


@Service("flashPromotionLogService")
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogDao, FlashPromotionLogEntity> implements FlashPromotionLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionLogEntity> page = this.page(
                new Query<FlashPromotionLogEntity>().getPage(params),
                new QueryWrapper<FlashPromotionLogEntity>()
        );

        return new PageUtils(page);
    }

}