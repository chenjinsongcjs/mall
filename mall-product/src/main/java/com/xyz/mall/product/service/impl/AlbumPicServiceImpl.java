package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.AlbumPicDao;
import com.xyz.mall.product.entity.AlbumPicEntity;
import com.xyz.mall.product.service.AlbumPicService;


@Service("albumPicService")
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicDao, AlbumPicEntity> implements AlbumPicService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AlbumPicEntity> page = this.page(
                new Query<AlbumPicEntity>().getPage(params),
                new QueryWrapper<AlbumPicEntity>()
        );

        return new PageUtils(page);
    }

}