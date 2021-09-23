package com.xyz.mall.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.content.entity.MemberReportEntity;

import java.util.Map;

/**
 * 用户举报表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:52
 */
public interface MemberReportService extends IService<MemberReportEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

