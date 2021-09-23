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

import com.xyz.mall.member.entity.MemberRuleSettingEntity;
import com.xyz.mall.member.service.MemberRuleSettingService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 会员积分成长规则表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:10
 */
@Api(tags = "memberRuleSettingController")
@RestController
@RequestMapping("member/memberrulesetting")
public class MemberRuleSettingController {
    @Autowired
    private MemberRuleSettingService memberRuleSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询memberRuleSetting")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberRuleSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberRuleSettingEntity memberRuleSetting = memberRuleSettingService.getById(id);

        return R.ok().put("memberRuleSetting", memberRuleSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存memberRuleSetting")
    @RequestMapping("/save")
    public R save(@RequestBody MemberRuleSettingEntity memberRuleSetting){
		memberRuleSettingService.save(memberRuleSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新memberRuleSetting")
    @RequestMapping("/update")
    public R update(@RequestBody MemberRuleSettingEntity memberRuleSetting){
		memberRuleSettingService.updateById(memberRuleSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除memberRuleSetting")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberRuleSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
