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

import com.xyz.mall.product.entity.ProductCategoryAttributeRelationEntity;
import com.xyz.mall.product.service.ProductCategoryAttributeRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:36
 */
@Api(tags = "productCategoryAttributeRelationController")
@RestController
@RequestMapping("product/productcategoryattributerelation")
public class ProductCategoryAttributeRelationController {
    @Autowired
    private ProductCategoryAttributeRelationService productCategoryAttributeRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productCategoryAttributeRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productCategoryAttributeRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductCategoryAttributeRelationEntity productCategoryAttributeRelation = productCategoryAttributeRelationService.getById(id);

        return R.ok().put("productCategoryAttributeRelation", productCategoryAttributeRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productCategoryAttributeRelation")
    @RequestMapping("/save")
    public R save(@RequestBody ProductCategoryAttributeRelationEntity productCategoryAttributeRelation){
		productCategoryAttributeRelationService.save(productCategoryAttributeRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productCategoryAttributeRelation")
    @RequestMapping("/update")
    public R update(@RequestBody ProductCategoryAttributeRelationEntity productCategoryAttributeRelation){
		productCategoryAttributeRelationService.updateById(productCategoryAttributeRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productCategoryAttributeRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productCategoryAttributeRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
