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

import com.xyz.mall.product.entity.ProductAttributeCategoryEntity;
import com.xyz.mall.product.service.ProductAttributeCategoryService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 产品属性分类表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Api(tags = "productAttributeCategoryController")
@RestController
@RequestMapping("product/productattributecategory")
public class ProductAttributeCategoryController {
    @Autowired
    private ProductAttributeCategoryService productAttributeCategoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productAttributeCategory")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productAttributeCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductAttributeCategoryEntity productAttributeCategory = productAttributeCategoryService.getById(id);

        return R.ok().put("productAttributeCategory", productAttributeCategory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productAttributeCategory")
    @RequestMapping("/save")
    public R save(@RequestBody ProductAttributeCategoryEntity productAttributeCategory){
		productAttributeCategoryService.save(productAttributeCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productAttributeCategory")
    @RequestMapping("/update")
    public R update(@RequestBody ProductAttributeCategoryEntity productAttributeCategory){
		productAttributeCategoryService.updateById(productAttributeCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productAttributeCategory")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productAttributeCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
