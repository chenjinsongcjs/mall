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

import com.xyz.mall.coupon.entity.FlashPromotionProductRelationEntity;
import com.xyz.mall.coupon.service.FlashPromotionProductRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 商品限时购与商品关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
@Api(tags = "flashPromotionProductRelationController")
@RestController
@RequestMapping("coupon/flashpromotionproductrelation")
public class FlashPromotionProductRelationController {
    @Autowired
    private FlashPromotionProductRelationService flashPromotionProductRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询flashPromotionProductRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		FlashPromotionProductRelationEntity flashPromotionProductRelation = flashPromotionProductRelationService.getById(id);

        return R.ok().put("flashPromotionProductRelation", flashPromotionProductRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存flashPromotionProductRelation")
    @RequestMapping("/save")
    public R save(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.save(flashPromotionProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新flashPromotionProductRelation")
    @RequestMapping("/update")
    public R update(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.updateById(flashPromotionProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除flashPromotionProductRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
