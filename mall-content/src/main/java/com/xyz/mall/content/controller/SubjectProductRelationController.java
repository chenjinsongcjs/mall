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

import com.xyz.mall.content.entity.SubjectProductRelationEntity;
import com.xyz.mall.content.service.SubjectProductRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 专题商品关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:51
 */
@Api(tags = "subjectProductRelationController")
@RestController
@RequestMapping("content/subjectproductrelation")
public class SubjectProductRelationController {
    @Autowired
    private SubjectProductRelationService subjectProductRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询subjectProductRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = subjectProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SubjectProductRelationEntity subjectProductRelation = subjectProductRelationService.getById(id);

        return R.ok().put("subjectProductRelation", subjectProductRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存subjectProductRelation")
    @RequestMapping("/save")
    public R save(@RequestBody SubjectProductRelationEntity subjectProductRelation){
		subjectProductRelationService.save(subjectProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新subjectProductRelation")
    @RequestMapping("/update")
    public R update(@RequestBody SubjectProductRelationEntity subjectProductRelation){
		subjectProductRelationService.updateById(subjectProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除subjectProductRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		subjectProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
