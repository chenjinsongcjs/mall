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

import com.xyz.mall.coupon.entity.HomeRecommendProductEntity;
import com.xyz.mall.coupon.service.HomeRecommendProductService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 人气推荐商品表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:57
 */
@Api(tags = "homeRecommendProductController")
@RestController
@RequestMapping("coupon/homerecommendproduct")
public class HomeRecommendProductController {
    @Autowired
    private HomeRecommendProductService homeRecommendProductService;

    /**
     * 列表
     */
    @ApiOperation("分页查询homeRecommendProduct")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeRecommendProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeRecommendProductEntity homeRecommendProduct = homeRecommendProductService.getById(id);

        return R.ok().put("homeRecommendProduct", homeRecommendProduct);
    }

    /**
     * 保存
     */
    @ApiOperation("保存homeRecommendProduct")
    @RequestMapping("/save")
    public R save(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.save(homeRecommendProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新homeRecommendProduct")
    @RequestMapping("/update")
    public R update(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.updateById(homeRecommendProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除homeRecommendProduct")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeRecommendProductService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
