package com.xyz.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.member.dao.AdminPermissionRelationDao;
import com.xyz.mall.member.entity.AdminPermissionRelationEntity;
import com.xyz.mall.member.service.AdminPermissionRelationService;


@Service("adminPermissionRelationService")
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationDao, AdminPermissionRelationEntity> implements AdminPermissionRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AdminPermissionRelationEntity> page = this.page(
                new Query<AdminPermissionRelationEntity>().getPage(params),
                new QueryWrapper<AdminPermissionRelationEntity>()
        );

        return new PageUtils(page);
    }

}