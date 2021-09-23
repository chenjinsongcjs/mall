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

import com.xyz.mall.member.entity.AdminRoleRelationEntity;
import com.xyz.mall.member.service.AdminRoleRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 后台用户和角色关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:14
 */
@Api(tags = "adminRoleRelationController")
@RestController
@RequestMapping("member/adminrolerelation")
public class AdminRoleRelationController {
    @Autowired
    private AdminRoleRelationService adminRoleRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询adminRoleRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adminRoleRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AdminRoleRelationEntity adminRoleRelation = adminRoleRelationService.getById(id);

        return R.ok().put("adminRoleRelation", adminRoleRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存adminRoleRelation")
    @RequestMapping("/save")
    public R save(@RequestBody AdminRoleRelationEntity adminRoleRelation){
		adminRoleRelationService.save(adminRoleRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新adminRoleRelation")
    @RequestMapping("/update")
    public R update(@RequestBody AdminRoleRelationEntity adminRoleRelation){
		adminRoleRelationService.updateById(adminRoleRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除adminRoleRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		adminRoleRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
