package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.MemberMemberTagRelationEntity;

import java.util.Map;

/**
 * 用户和标签关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:11
 */
public interface MemberMemberTagRelationService extends IService<MemberMemberTagRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

