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

import com.xyz.mall.member.entity.MemberMemberTagRelationEntity;
import com.xyz.mall.member.service.MemberMemberTagRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 用户和标签关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:11
 */
@Api(tags = "memberMemberTagRelationController")
@RestController
@RequestMapping("member/membermembertagrelation")
public class MemberMemberTagRelationController {
    @Autowired
    private MemberMemberTagRelationService memberMemberTagRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询memberMemberTagRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberMemberTagRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberMemberTagRelationEntity memberMemberTagRelation = memberMemberTagRelationService.getById(id);

        return R.ok().put("memberMemberTagRelation", memberMemberTagRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存memberMemberTagRelation")
    @RequestMapping("/save")
    public R save(@RequestBody MemberMemberTagRelationEntity memberMemberTagRelation){
		memberMemberTagRelationService.save(memberMemberTagRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新memberMemberTagRelation")
    @RequestMapping("/update")
    public R update(@RequestBody MemberMemberTagRelationEntity memberMemberTagRelation){
		memberMemberTagRelationService.updateById(memberMemberTagRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除memberMemberTagRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberMemberTagRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
