package com.xyz.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.Query;

import com.xyz.mall.product.dao.AlbumDao;
import com.xyz.mall.product.entity.AlbumEntity;
import com.xyz.mall.product.service.AlbumService;


@Service("albumService")
public class AlbumServiceImpl extends ServiceImpl<AlbumDao, AlbumEntity> implements AlbumService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AlbumEntity> page = this.page(
                new Query<AlbumEntity>().getPage(params),
                new QueryWrapper<AlbumEntity>()
        );

        return new PageUtils(page);
    }

}