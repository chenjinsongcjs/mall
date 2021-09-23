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

import com.xyz.mall.content.entity.SubjectCategoryEntity;
import com.xyz.mall.content.service.SubjectCategoryService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 专题分类表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:51
 */
@Api(tags = "subjectCategoryController")
@RestController
@RequestMapping("content/subjectcategory")
public class SubjectCategoryController {
    @Autowired
    private SubjectCategoryService subjectCategoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询subjectCategory")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = subjectCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SubjectCategoryEntity subjectCategory = subjectCategoryService.getById(id);

        return R.ok().put("subjectCategory", subjectCategory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存subjectCategory")
    @RequestMapping("/save")
    public R save(@RequestBody SubjectCategoryEntity subjectCategory){
		subjectCategoryService.save(subjectCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新subjectCategory")
    @RequestMapping("/update")
    public R update(@RequestBody SubjectCategoryEntity subjectCategory){
		subjectCategoryService.updateById(subjectCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除subjectCategory")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		subjectCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
