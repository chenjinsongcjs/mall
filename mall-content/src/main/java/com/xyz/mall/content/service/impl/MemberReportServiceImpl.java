package com.xyz.mall.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.content.dao.MemberReportDao;
import com.xyz.mall.content.entity.MemberReportEntity;
import com.xyz.mall.content.service.MemberReportService;


@Service("memberReportService")
public class MemberReportServiceImpl extends ServiceImpl<MemberReportDao, MemberReportEntity> implements MemberReportService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberReportEntity> page = this.page(
                new Query<MemberReportEntity>().getPage(params),
                new QueryWrapper<MemberReportEntity>()
        );

        return new PageUtils(page);
    }

}