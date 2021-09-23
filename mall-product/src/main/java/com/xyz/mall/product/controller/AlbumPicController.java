package com.xyz.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.mall.product.entity.AlbumPicEntity;
import com.xyz.mall.product.service.AlbumPicService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 画册图片表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:41
 */
@Api(tags = "albumPicController")
@RestController
@RequestMapping("product/albumpic")
public class AlbumPicController {
    @Autowired
    private AlbumPicService albumPicService;

    /**
     * 列表
     */
    @ApiOperation("分页查询albumPic")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = albumPicService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AlbumPicEntity albumPic = albumPicService.getById(id);

        return R.ok().put("albumPic", albumPic);
    }

    /**
     * 保存
     */
    @ApiOperation("保存albumPic")
    @RequestMapping("/save")
    public R save(@RequestBody AlbumPicEntity albumPic){
		albumPicService.save(albumPic);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新albumPic")
    @RequestMapping("/update")
    public R update(@RequestBody AlbumPicEntity albumPic){
		albumPicService.updateById(albumPic);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除albumPic")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		albumPicService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
