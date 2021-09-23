package com.xyz.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.member.dao.AdminRoleRelationDao;
import com.xyz.mall.member.entity.AdminRoleRelationEntity;
import com.xyz.mall.member.service.AdminRoleRelationService;


@Service("adminRoleRelationService")
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationDao, AdminRoleRelationEntity> implements AdminRoleRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AdminRoleRelationEntity> page = this.page(
                new Query<AdminRoleRelationEntity>().getPage(params),
                new QueryWrapper<AdminRoleRelationEntity>()
        );

        return new PageUtils(page);
    }

}