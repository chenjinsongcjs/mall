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

import com.xyz.mall.member.entity.AdminPermissionRelationEntity;
import com.xyz.mall.member.service.AdminPermissionRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
@Api(tags = "adminPermissionRelationController")
@RestController
@RequestMapping("member/adminpermissionrelation")
public class AdminPermissionRelationController {
    @Autowired
    private AdminPermissionRelationService adminPermissionRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询adminPermissionRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adminPermissionRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AdminPermissionRelationEntity adminPermissionRelation = adminPermissionRelationService.getById(id);

        return R.ok().put("adminPermissionRelation", adminPermissionRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存adminPermissionRelation")
    @RequestMapping("/save")
    public R save(@RequestBody AdminPermissionRelationEntity adminPermissionRelation){
		adminPermissionRelationService.save(adminPermissionRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新adminPermissionRelation")
    @RequestMapping("/update")
    public R update(@RequestBody AdminPermissionRelationEntity adminPermissionRelation){
		adminPermissionRelationService.updateById(adminPermissionRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除adminPermissionRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		adminPermissionRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
