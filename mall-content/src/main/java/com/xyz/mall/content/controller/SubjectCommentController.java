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

import com.xyz.mall.content.entity.SubjectCommentEntity;
import com.xyz.mall.content.service.SubjectCommentService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 专题评论表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:50
 */
@Api(tags = "subjectCommentController")
@RestController
@RequestMapping("content/subjectcomment")
public class SubjectCommentController {
    @Autowired
    private SubjectCommentService subjectCommentService;

    /**
     * 列表
     */
    @ApiOperation("分页查询subjectComment")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = subjectCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SubjectCommentEntity subjectComment = subjectCommentService.getById(id);

        return R.ok().put("subjectComment", subjectComment);
    }

    /**
     * 保存
     */
    @ApiOperation("保存subjectComment")
    @RequestMapping("/save")
    public R save(@RequestBody SubjectCommentEntity subjectComment){
		subjectCommentService.save(subjectComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新subjectComment")
    @RequestMapping("/update")
    public R update(@RequestBody SubjectCommentEntity subjectComment){
		subjectCommentService.updateById(subjectComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除subjectComment")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		subjectCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
