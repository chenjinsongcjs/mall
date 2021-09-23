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

import com.xyz.mall.coupon.entity.FlashPromotionEntity;
import com.xyz.mall.coupon.service.FlashPromotionService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 限时购表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:56:00
 */
@Api(tags = "flashPromotionController")
@RestController
@RequestMapping("coupon/flashpromotion")
public class FlashPromotionController {
    @Autowired
    private FlashPromotionService flashPromotionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询flashPromotion")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		FlashPromotionEntity flashPromotion = flashPromotionService.getById(id);

        return R.ok().put("flashPromotion", flashPromotion);
    }

    /**
     * 保存
     */
    @ApiOperation("保存flashPromotion")
    @RequestMapping("/save")
    public R save(@RequestBody FlashPromotionEntity flashPromotion){
		flashPromotionService.save(flashPromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新flashPromotion")
    @RequestMapping("/update")
    public R update(@RequestBody FlashPromotionEntity flashPromotion){
		flashPromotionService.updateById(flashPromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除flashPromotion")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
