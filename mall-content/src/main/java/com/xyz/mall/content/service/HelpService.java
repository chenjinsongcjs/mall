package com.xyz.mall.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.content.entity.HelpEntity;

import java.util.Map;

/**
 * 帮助表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:53
 */
public interface HelpService extends IService<HelpEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

