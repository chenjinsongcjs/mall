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

import com.xyz.mall.coupon.entity.CouponProductRelationEntity;
import com.xyz.mall.coupon.service.CouponProductRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 优惠券和产品的关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
@Api(tags = "couponProductRelationController")
@RestController
@RequestMapping("coupon/couponproductrelation")
public class CouponProductRelationController {
    @Autowired
    private CouponProductRelationService couponProductRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询couponProductRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponProductRelationEntity couponProductRelation = couponProductRelationService.getById(id);

        return R.ok().put("couponProductRelation", couponProductRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存couponProductRelation")
    @RequestMapping("/save")
    public R save(@RequestBody CouponProductRelationEntity couponProductRelation){
		couponProductRelationService.save(couponProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新couponProductRelation")
    @RequestMapping("/update")
    public R update(@RequestBody CouponProductRelationEntity couponProductRelation){
		couponProductRelationService.updateById(couponProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除couponProductRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
