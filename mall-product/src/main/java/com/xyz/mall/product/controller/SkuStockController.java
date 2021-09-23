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

import com.xyz.mall.product.entity.SkuStockEntity;
import com.xyz.mall.product.service.SkuStockService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * sku的库存
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:34
 */
@Api(tags = "skuStockController")
@RestController
@RequestMapping("product/skustock")
public class SkuStockController {
    @Autowired
    private SkuStockService skuStockService;

    /**
     * 列表
     */
    @ApiOperation("分页查询skuStock")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuStockService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SkuStockEntity skuStock = skuStockService.getById(id);

        return R.ok().put("skuStock", skuStock);
    }

    /**
     * 保存
     */
    @ApiOperation("保存skuStock")
    @RequestMapping("/save")
    public R save(@RequestBody SkuStockEntity skuStock){
		skuStockService.save(skuStock);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新skuStock")
    @RequestMapping("/update")
    public R update(@RequestBody SkuStockEntity skuStock){
		skuStockService.updateById(skuStock);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除skuStock")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		skuStockService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
