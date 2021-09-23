package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.AdminLoginLogEntity;

import java.util.Map;

/**
 * 后台用户登录日志表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
public interface AdminLoginLogService extends IService<AdminLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

