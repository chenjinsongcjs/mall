package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.AdminRoleRelationEntity;

import java.util.Map;

/**
 * 后台用户和角色关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:14
 */
public interface AdminRoleRelationService extends IService<AdminRoleRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

