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

import com.xyz.mall.product.entity.ProductLadderEntity;
import com.xyz.mall.product.service.ProductLadderService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:51:36
 */
@Api(tags = "productLadderController")
@RestController
@RequestMapping("product/productladder")
public class ProductLadderController {
    @Autowired
    private ProductLadderService productLadderService;

    /**
     * 列表
     */
    @ApiOperation("分页查询productLadder")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productLadderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductLadderEntity productLadder = productLadderService.getById(id);

        return R.ok().put("productLadder", productLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("保存productLadder")
    @RequestMapping("/save")
    public R save(@RequestBody ProductLadderEntity productLadder){
		productLadderService.save(productLadder);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新productLadder")
    @RequestMapping("/update")
    public R update(@RequestBody ProductLadderEntity productLadder){
		productLadderService.updateById(productLadder);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除productLadder")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productLadderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
