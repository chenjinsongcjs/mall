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

import com.xyz.mall.content.entity.TopicCommentEntity;
import com.xyz.mall.content.service.TopicCommentService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 专题评论表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:49
 */
@Api(tags = "topicCommentController")
@RestController
@RequestMapping("content/topiccomment")
public class TopicCommentController {
    @Autowired
    private TopicCommentService topicCommentService;

    /**
     * 列表
     */
    @ApiOperation("分页查询topicComment")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = topicCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		TopicCommentEntity topicComment = topicCommentService.getById(id);

        return R.ok().put("topicComment", topicComment);
    }

    /**
     * 保存
     */
    @ApiOperation("保存topicComment")
    @RequestMapping("/save")
    public R save(@RequestBody TopicCommentEntity topicComment){
		topicCommentService.save(topicComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新topicComment")
    @RequestMapping("/update")
    public R update(@RequestBody TopicCommentEntity topicComment){
		topicCommentService.updateById(topicComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除topicComment")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		topicCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
