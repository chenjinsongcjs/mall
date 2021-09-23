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

import com.xyz.mall.product.entity.ProductOperateLogEntity;
import com.xyz.mall.product.service.ProductOperateLogService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:35
 */
@Api(tags = "productOperateLogController")
@RestController
@RequestMapping("product/productoperatelog")
public class ProductOperateLogController {
    @Autowired
    private ProductOperateLogService productOperateLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productOperateLog")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productOperateLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductOperateLogEntity productOperateLog = productOperateLogService.getById(id);

        return R.ok().put("productOperateLog", productOperateLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productOperateLog")
    @RequestMapping("/save")
    public R save(@RequestBody ProductOperateLogEntity productOperateLog){
		productOperateLogService.save(productOperateLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productOperateLog")
    @RequestMapping("/update")
    public R update(@RequestBody ProductOperateLogEntity productOperateLog){
		productOperateLogService.updateById(productOperateLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productOperateLog")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productOperateLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
