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

import com.xyz.mall.product.entity.ProductVertifyRecordEntity;
import com.xyz.mall.product.service.ProductVertifyRecordService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 商品审核记录
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:35
 */
@Api(tags = "productVertifyRecordController")
@RestController
@RequestMapping("product/productvertifyrecord")
public class ProductVertifyRecordController {
    @Autowired
    private ProductVertifyRecordService productVertifyRecordService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productVertifyRecord")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productVertifyRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductVertifyRecordEntity productVertifyRecord = productVertifyRecordService.getById(id);

        return R.ok().put("productVertifyRecord", productVertifyRecord);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productVertifyRecord")
    @RequestMapping("/save")
    public R save(@RequestBody ProductVertifyRecordEntity productVertifyRecord){
		productVertifyRecordService.save(productVertifyRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productVertifyRecord")
    @RequestMapping("/update")
    public R update(@RequestBody ProductVertifyRecordEntity productVertifyRecord){
		productVertifyRecordService.updateById(productVertifyRecord);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productVertifyRecord")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productVertifyRecordService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
