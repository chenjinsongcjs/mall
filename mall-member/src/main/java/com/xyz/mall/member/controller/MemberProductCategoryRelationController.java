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

import com.xyz.mall.member.entity.MemberProductCategoryRelationEntity;
import com.xyz.mall.member.service.MemberProductCategoryRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:12
 */
@Api(tags = "memberProductCategoryRelationController")
@RestController
@RequestMapping("member/memberproductcategoryrelation")
public class MemberProductCategoryRelationController {
    @Autowired
    private MemberProductCategoryRelationService memberProductCategoryRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询memberProductCategoryRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberProductCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberProductCategoryRelationEntity memberProductCategoryRelation = memberProductCategoryRelationService.getById(id);

        return R.ok().put("memberProductCategoryRelation", memberProductCategoryRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存memberProductCategoryRelation")
    @RequestMapping("/save")
    public R save(@RequestBody MemberProductCategoryRelationEntity memberProductCategoryRelation){
		memberProductCategoryRelationService.save(memberProductCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新memberProductCategoryRelation")
    @RequestMapping("/update")
    public R update(@RequestBody MemberProductCategoryRelationEntity memberProductCategoryRelation){
		memberProductCategoryRelationService.updateById(memberProductCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除memberProductCategoryRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
