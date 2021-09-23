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

import com.xyz.mall.product.entity.ProductAttributeValueEntity;
import com.xyz.mall.product.service.ProductAttributeValueService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 存储产品参数信息的表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:37
 */
@Api(tags = "productAttributeValueController")
@RestController
@RequestMapping("product/productattributevalue")
public class ProductAttributeValueController {
    @Autowired
    private ProductAttributeValueService productAttributeValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productAttributeValue")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productAttributeValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductAttributeValueEntity productAttributeValue = productAttributeValueService.getById(id);

        return R.ok().put("productAttributeValue", productAttributeValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productAttributeValue")
    @RequestMapping("/save")
    public R save(@RequestBody ProductAttributeValueEntity productAttributeValue){
		productAttributeValueService.save(productAttributeValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productAttributeValue")
    @RequestMapping("/update")
    public R update(@RequestBody ProductAttributeValueEntity productAttributeValue){
		productAttributeValueService.updateById(productAttributeValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productAttributeValue")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productAttributeValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
