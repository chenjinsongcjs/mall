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

import com.xyz.mall.member.entity.RolePermissionRelationEntity;
import com.xyz.mall.member.service.RolePermissionRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 后台用户角色和权限关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:08
 */
@Api(tags = "rolePermissionRelationController")
@RestController
@RequestMapping("member/rolepermissionrelation")
public class RolePermissionRelationController {
    @Autowired
    private RolePermissionRelationService rolePermissionRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询rolePermissionRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = rolePermissionRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		RolePermissionRelationEntity rolePermissionRelation = rolePermissionRelationService.getById(id);

        return R.ok().put("rolePermissionRelation", rolePermissionRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存rolePermissionRelation")
    @RequestMapping("/save")
    public R save(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.save(rolePermissionRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新rolePermissionRelation")
    @RequestMapping("/update")
    public R update(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.updateById(rolePermissionRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除rolePermissionRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		rolePermissionRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
