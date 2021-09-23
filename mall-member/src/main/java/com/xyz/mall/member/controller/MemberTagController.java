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

import com.xyz.mall.member.entity.MemberTagEntity;
import com.xyz.mall.member.service.MemberTagService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 用户标签表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:10
 */
@Api(tags = "memberTagController")
@RestController
@RequestMapping("member/membertag")
public class MemberTagController {
    @Autowired
    private MemberTagService memberTagService;

    /**
     * 列表
     */
    @ApiOperation("分页查询memberTag")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberTagService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberTagEntity memberTag = memberTagService.getById(id);

        return R.ok().put("memberTag", memberTag);
    }

    /**
     * 保存
     */
    @ApiOperation("保存memberTag")
    @RequestMapping("/save")
    public R save(@RequestBody MemberTagEntity memberTag){
		memberTagService.save(memberTag);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新memberTag")
    @RequestMapping("/update")
    public R update(@RequestBody MemberTagEntity memberTag){
		memberTagService.updateById(memberTag);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除memberTag")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberTagService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
