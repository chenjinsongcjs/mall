package com.xyz.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.order.dao.CompanyAddressDao;
import com.xyz.mall.order.entity.CompanyAddressEntity;
import com.xyz.mall.order.service.CompanyAddressService;


@Service("companyAddressService")
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressDao, CompanyAddressEntity> implements CompanyAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CompanyAddressEntity> page = this.page(
                new Query<CompanyAddressEntity>().getPage(params),
                new QueryWrapper<CompanyAddressEntity>()
        );

        return new PageUtils(page);
    }

}