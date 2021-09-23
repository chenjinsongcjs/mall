package com.xyz.mall.member.controller;

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

import com.xyz.mall.member.entity.IntegrationConsumeSettingEntity;
import com.xyz.mall.member.service.IntegrationConsumeSettingService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 积分消费设置
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:13
 */
@Api(tags = "integrationConsumeSettingController")
@RestController
@RequestMapping("member/integrationconsumesetting")
public class IntegrationConsumeSettingController {
    @Autowired
    private IntegrationConsumeSettingService integrationConsumeSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询integrationConsumeSetting")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = integrationConsumeSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		IntegrationConsumeSettingEntity integrationConsumeSetting = integrationConsumeSettingService.getById(id);

        return R.ok().put("integrationConsumeSetting", integrationConsumeSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存integrationConsumeSetting")
    @RequestMapping("/save")
    public R save(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.save(integrationConsumeSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新integrationConsumeSetting")
    @RequestMapping("/update")
    public R update(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.updateById(integrationConsumeSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除integrationConsumeSetting")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		integrationConsumeSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
