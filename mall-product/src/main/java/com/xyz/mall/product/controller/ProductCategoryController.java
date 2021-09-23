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

import com.xyz.mall.product.entity.ProductCategoryEntity;
import com.xyz.mall.product.service.ProductCategoryService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 产品分类
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Api(tags = "productCategoryController")
@RestController
@RequestMapping("product/productcategory")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productCategory")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductCategoryEntity productCategory = productCategoryService.getById(id);

        return R.ok().put("productCategory", productCategory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productCategory")
    @RequestMapping("/save")
    public R save(@RequestBody ProductCategoryEntity productCategory){
		productCategoryService.save(productCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productCategory")
    @RequestMapping("/update")
    public R update(@RequestBody ProductCategoryEntity productCategory){
		productCategoryService.updateById(productCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productCategory")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
