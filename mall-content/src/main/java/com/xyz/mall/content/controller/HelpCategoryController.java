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

import com.xyz.mall.content.entity.HelpCategoryEntity;
import com.xyz.mall.content.service.HelpCategoryService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 帮助分类表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:53
 */
@Api(tags = "helpCategoryController")
@RestController
@RequestMapping("content/helpcategory")
public class HelpCategoryController {
    @Autowired
    private HelpCategoryService helpCategoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询helpCategory")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = helpCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HelpCategoryEntity helpCategory = helpCategoryService.getById(id);

        return R.ok().put("helpCategory", helpCategory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存helpCategory")
    @RequestMapping("/save")
    public R save(@RequestBody HelpCategoryEntity helpCategory){
		helpCategoryService.save(helpCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新helpCategory")
    @RequestMapping("/update")
    public R update(@RequestBody HelpCategoryEntity helpCategory){
		helpCategoryService.updateById(helpCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除helpCategory")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		helpCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
