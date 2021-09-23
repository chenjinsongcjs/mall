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

import com.xyz.mall.member.entity.MemberTaskEntity;
import com.xyz.mall.member.service.MemberTaskService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 会员任务表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:09
 */
@Api(tags = "memberTaskController")
@RestController
@RequestMapping("member/membertask")
public class MemberTaskController {
    @Autowired
    private MemberTaskService memberTaskService;

    /**
     * 列表
     */
    @ApiOperation("分页查询memberTask")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberTaskEntity memberTask = memberTaskService.getById(id);

        return R.ok().put("memberTask", memberTask);
    }

    /**
     * 保存
     */
    @ApiOperation("保存memberTask")
    @RequestMapping("/save")
    public R save(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.save(memberTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新memberTask")
    @RequestMapping("/update")
    public R update(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.updateById(memberTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除memberTask")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
