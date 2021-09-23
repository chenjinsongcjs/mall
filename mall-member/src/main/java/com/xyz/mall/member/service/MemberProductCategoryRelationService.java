package com.xyz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.member.entity.MemberProductCategoryRelationEntity;

import java.util.Map;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:12
 */
public interface MemberProductCategoryRelationService extends IService<MemberProductCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

