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

import com.xyz.mall.content.entity.SubjectEntity;
import com.xyz.mall.content.service.SubjectService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 专题表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:51
 */
@Api(tags = "subjectController")
@RestController
@RequestMapping("content/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询subject")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = subjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SubjectEntity subject = subjectService.getById(id);

        return R.ok().put("subject", subject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存subject")
    @RequestMapping("/save")
    public R save(@RequestBody SubjectEntity subject){
		subjectService.save(subject);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新subject")
    @RequestMapping("/update")
    public R update(@RequestBody SubjectEntity subject){
		subjectService.updateById(subject);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除subject")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		subjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
