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

import com.xyz.mall.coupon.entity.CouponProductCategoryRelationEntity;
import com.xyz.mall.coupon.service.CouponProductCategoryRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 优惠券和产品分类关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
@Api(tags = "couponProductCategoryRelationController")
@RestController
@RequestMapping("coupon/couponproductcategoryrelation")
public class CouponProductCategoryRelationController {
    @Autowired
    private CouponProductCategoryRelationService couponProductCategoryRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询couponProductCategoryRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponProductCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponProductCategoryRelationEntity couponProductCategoryRelation = couponProductCategoryRelationService.getById(id);

        return R.ok().put("couponProductCategoryRelation", couponProductCategoryRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存couponProductCategoryRelation")
    @RequestMapping("/save")
    public R save(@RequestBody CouponProductCategoryRelationEntity couponProductCategoryRelation){
		couponProductCategoryRelationService.save(couponProductCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新couponProductCategoryRelation")
    @RequestMapping("/update")
    public R update(@RequestBody CouponProductCategoryRelationEntity couponProductCategoryRelation){
		couponProductCategoryRelationService.updateById(couponProductCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除couponProductCategoryRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
