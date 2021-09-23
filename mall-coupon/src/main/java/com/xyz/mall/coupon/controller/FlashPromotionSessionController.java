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

import com.xyz.mall.coupon.entity.FlashPromotionSessionEntity;
import com.xyz.mall.coupon.service.FlashPromotionSessionService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 限时购场次表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
@Api(tags = "flashPromotionSessionController")
@RestController
@RequestMapping("coupon/flashpromotionsession")
public class FlashPromotionSessionController {
    @Autowired
    private FlashPromotionSessionService flashPromotionSessionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询flashPromotionSession")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionSessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		FlashPromotionSessionEntity flashPromotionSession = flashPromotionSessionService.getById(id);

        return R.ok().put("flashPromotionSession", flashPromotionSession);
    }

    /**
     * 保存
     */
    @ApiOperation("保存flashPromotionSession")
    @RequestMapping("/save")
    public R save(@RequestBody FlashPromotionSessionEntity flashPromotionSession){
		flashPromotionSessionService.save(flashPromotionSession);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新flashPromotionSession")
    @RequestMapping("/update")
    public R update(@RequestBody FlashPromotionSessionEntity flashPromotionSession){
		flashPromotionSessionService.updateById(flashPromotionSession);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除flashPromotionSession")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
