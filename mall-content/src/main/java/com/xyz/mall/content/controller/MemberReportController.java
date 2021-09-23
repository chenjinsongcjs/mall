package com.xyz.mall.content.controller;

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

import com.xyz.mall.content.entity.MemberReportEntity;
import com.xyz.mall.content.service.MemberReportService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 用户举报表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:52
 */
@Api(tags = "memberReportController")
@RestController
@RequestMapping("content/memberreport")
public class MemberReportController {
    @Autowired
    private MemberReportService memberReportService;

    /**
     * 列表
     */
    @ApiOperation("分页查询memberReport")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberReportService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberReportEntity memberReport = memberReportService.getById(id);

        return R.ok().put("memberReport", memberReport);
    }

    /**
     * 保存
     */
    @ApiOperation("保存memberReport")
    @RequestMapping("/save")
    public R save(@RequestBody MemberReportEntity memberReport){
		memberReportService.save(memberReport);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新memberReport")
    @RequestMapping("/update")
    public R update(@RequestBody MemberReportEntity memberReport){
		memberReportService.updateById(memberReport);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除memberReport")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberReportService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
