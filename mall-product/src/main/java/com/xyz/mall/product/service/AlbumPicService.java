package com.xyz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.product.entity.AlbumPicEntity;

import java.util.Map;

/**
 * 画册图片表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:41
 */
public interface AlbumPicService extends IService<AlbumPicEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

