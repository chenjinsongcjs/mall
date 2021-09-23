package com.xyz.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.member.dao.RolePermissionRelationDao;
import com.xyz.mall.member.entity.RolePermissionRelationEntity;
import com.xyz.mall.member.service.RolePermissionRelationService;


@Service("rolePermissionRelationService")
public class RolePermissionRelationServiceImpl extends ServiceImpl<RolePermissionRelationDao, RolePermissionRelationEntity> implements RolePermissionRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RolePermissionRelationEntity> page = this.page(
                new Query<RolePermissionRelationEntity>().getPage(params),
                new QueryWrapper<RolePermissionRelationEntity>()
        );

        return new PageUtils(page);
    }

}