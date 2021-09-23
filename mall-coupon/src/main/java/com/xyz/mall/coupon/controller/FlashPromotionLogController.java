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

import com.xyz.mall.coupon.entity.FlashPromotionLogEntity;
import com.xyz.mall.coupon.service.FlashPromotionLogService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 限时购通知记录
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:59
 */
@Api(tags = "flashPromotionLogController")
@RestController
@RequestMapping("coupon/flashpromotionlog")
public class FlashPromotionLogController {
    @Autowired
    private FlashPromotionLogService flashPromotionLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询flashPromotionLog")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		FlashPromotionLogEntity flashPromotionLog = flashPromotionLogService.getById(id);

        return R.ok().put("flashPromotionLog", flashPromotionLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存flashPromotionLog")
    @RequestMapping("/save")
    public R save(@RequestBody FlashPromotionLogEntity flashPromotionLog){
		flashPromotionLogService.save(flashPromotionLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新flashPromotionLog")
    @RequestMapping("/update")
    public R update(@RequestBody FlashPromotionLogEntity flashPromotionLog){
		flashPromotionLogService.updateById(flashPromotionLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除flashPromotionLog")
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		flashPromotionLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
