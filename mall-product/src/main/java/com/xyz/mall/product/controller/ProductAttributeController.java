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

import com.xyz.mall.product.entity.ProductAttributeEntity;
import com.xyz.mall.product.service.ProductAttributeService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 商品属性参数表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:38
 */
@Api(tags = "productAttributeController")
@RestController
@RequestMapping("product/productattribute")
public class ProductAttributeController {
    @Autowired
    private ProductAttributeService productAttributeService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productAttribute")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productAttributeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductAttributeEntity productAttribute = productAttributeService.getById(id);

        return R.ok().put("productAttribute", productAttribute);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productAttribute")
    @RequestMapping("/save")
    public R save(@RequestBody ProductAttributeEntity productAttribute){
		productAttributeService.save(productAttribute);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productAttribute")
    @RequestMapping("/update")
    public R update(@RequestBody ProductAttributeEntity productAttribute){
		productAttributeService.updateById(productAttribute);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productAttribute")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productAttributeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
