package com.xyz.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.member.dao.AdminLoginLogDao;
import com.xyz.mall.member.entity.AdminLoginLogEntity;
import com.xyz.mall.member.service.AdminLoginLogService;


@Service("adminLoginLogService")
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogDao, AdminLoginLogEntity> implements AdminLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AdminLoginLogEntity> page = this.page(
                new Query<AdminLoginLogEntity>().getPage(params),
                new QueryWrapper<AdminLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}