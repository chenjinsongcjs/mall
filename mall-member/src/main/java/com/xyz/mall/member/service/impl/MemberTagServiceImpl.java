package com.xyz.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.member.dao.MemberTagDao;
import com.xyz.mall.member.entity.MemberTagEntity;
import com.xyz.mall.member.service.MemberTagService;


@Service("memberTagService")
public class MemberTagServiceImpl extends ServiceImpl<MemberTagDao, MemberTagEntity> implements MemberTagService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberTagEntity> page = this.page(
                new Query<MemberTagEntity>().getPage(params),
                new QueryWrapper<MemberTagEntity>()
        );

        return new PageUtils(page);
    }

}