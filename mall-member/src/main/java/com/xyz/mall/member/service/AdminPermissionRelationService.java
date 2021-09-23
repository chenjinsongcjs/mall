package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.AdminPermissionRelationEntity;

import java.util.Map;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
public interface AdminPermissionRelationService extends IService<AdminPermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

