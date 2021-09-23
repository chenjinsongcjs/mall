package com.xyz.mall.coupon.controller;

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

import com.xyz.mall.coupon.entity.HomeAdvertiseEntity;
import com.xyz.mall.coupon.service.HomeAdvertiseService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 首页轮播广告表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:58
 */
@Api(tags = "homeAdvertiseController")
@RestController
@RequestMapping("coupon/homeadvertise")
public class HomeAdvertiseController {
    @Autowired
    private HomeAdvertiseService homeAdvertiseService;

    /**
     * 列表
     */
    @ApiOperation("分页查询homeAdvertise")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvertiseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeAdvertiseEntity homeAdvertise = homeAdvertiseService.getById(id);

        return R.ok().put("homeAdvertise", homeAdvertise);
    }

    /**
     * 保存
     */
    @ApiOperation("保存homeAdvertise")
    @RequestMapping("/save")
    public R save(@RequestBody HomeAdvertiseEntity homeAdvertise){
		homeAdvertiseService.save(homeAdvertise);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新homeAdvertise")
    @RequestMapping("/update")
    public R update(@RequestBody HomeAdvertiseEntity homeAdvertise){
		homeAdvertiseService.updateById(homeAdvertise);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除homeAdvertise")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeAdvertiseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
