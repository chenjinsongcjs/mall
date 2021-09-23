package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.MemberTaskEntity;

import java.util.Map;

/**
 * 会员任务表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:09
 */
public interface MemberTaskService extends IService<MemberTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

