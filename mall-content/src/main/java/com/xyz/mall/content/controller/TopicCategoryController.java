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

import com.xyz.mall.content.entity.TopicCategoryEntity;
import com.xyz.mall.content.service.TopicCategoryService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 话题分类表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:50
 */
@Api(tags = "topicCategoryController")
@RestController
@RequestMapping("content/topiccategory")
public class TopicCategoryController {
    @Autowired
    private TopicCategoryService topicCategoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询topicCategory")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = topicCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		TopicCategoryEntity topicCategory = topicCategoryService.getById(id);

        return R.ok().put("topicCategory", topicCategory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存topicCategory")
    @RequestMapping("/save")
    public R save(@RequestBody TopicCategoryEntity topicCategory){
		topicCategoryService.save(topicCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新topicCategory")
    @RequestMapping("/update")
    public R update(@RequestBody TopicCategoryEntity topicCategory){
		topicCategoryService.updateById(topicCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除topicCategory")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		topicCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
