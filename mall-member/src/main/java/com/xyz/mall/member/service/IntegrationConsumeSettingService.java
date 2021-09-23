package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.IntegrationConsumeSettingEntity;

import java.util.Map;

/**
 * 积分消费设置
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:13
 */
public interface IntegrationConsumeSettingService extends IService<IntegrationConsumeSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

