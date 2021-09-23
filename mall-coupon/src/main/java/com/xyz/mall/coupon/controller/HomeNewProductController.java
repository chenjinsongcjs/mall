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

import com.xyz.mall.coupon.entity.HomeNewProductEntity;
import com.xyz.mall.coupon.service.HomeNewProductService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 新鲜好物表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:58
 */
@Api(tags = "homeNewProductController")
@RestController
@RequestMapping("coupon/homenewproduct")
public class HomeNewProductController {
    @Autowired
    private HomeNewProductService homeNewProductService;

    /**
     * 列表
     */
    @ApiOperation("分页查询homeNewProduct")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeNewProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeNewProductEntity homeNewProduct = homeNewProductService.getById(id);

        return R.ok().put("homeNewProduct", homeNewProduct);
    }

    /**
     * 保存
     */
    @ApiOperation("保存homeNewProduct")
    @RequestMapping("/save")
    public R save(@RequestBody HomeNewProductEntity homeNewProduct){
		homeNewProductService.save(homeNewProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新homeNewProduct")
    @RequestMapping("/update")
    public R update(@RequestBody HomeNewProductEntity homeNewProduct){
		homeNewProductService.updateById(homeNewProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除homeNewProduct")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeNewProductService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
