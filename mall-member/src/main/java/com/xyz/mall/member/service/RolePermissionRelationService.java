package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.RolePermissionRelationEntity;

import java.util.Map;

/**
 * 后台用户角色和权限关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:08
 */
public interface RolePermissionRelationService extends IService<RolePermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

