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

import com.xyz.mall.product.entity.AlbumEntity;
import com.xyz.mall.product.service.AlbumService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 相册表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:41
 */
@Api(tags = "albumController")
@RestController
@RequestMapping("product/album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    /**
     * 列表
     */
    @ApiOperation("分页查询album")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = albumService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AlbumEntity album = albumService.getById(id);

        return R.ok().put("album", album);
    }

    /**
     * 保存
     */
    @ApiOperation("保存album")
    @RequestMapping("/save")
    public R save(@RequestBody AlbumEntity album){
		albumService.save(album);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新album")
    @RequestMapping("/update")
    public R update(@RequestBody AlbumEntity album){
		albumService.updateById(album);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除album")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		albumService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
