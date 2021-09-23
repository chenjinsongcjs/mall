package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.MemberTagEntity;

import java.util.Map;

/**
 * 用户标签表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:10
 */
public interface MemberTagService extends IService<MemberTagEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

