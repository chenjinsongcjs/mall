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

import com.xyz.mall.content.entity.PrefrenceAreaProductRelationEntity;
import com.xyz.mall.content.service.PrefrenceAreaProductRelationService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 优选专区和产品关系表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:52
 */
@Api(tags = "prefrenceAreaProductRelationController")
@RestController
@RequestMapping("content/prefrenceareaproductrelation")
public class PrefrenceAreaProductRelationController {
    @Autowired
    private PrefrenceAreaProductRelationService prefrenceAreaProductRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询prefrenceAreaProductRelation")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = prefrenceAreaProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PrefrenceAreaProductRelationEntity prefrenceAreaProductRelation = prefrenceAreaProductRelationService.getById(id);

        return R.ok().put("prefrenceAreaProductRelation", prefrenceAreaProductRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存prefrenceAreaProductRelation")
    @RequestMapping("/save")
    public R save(@RequestBody PrefrenceAreaProductRelationEntity prefrenceAreaProductRelation){
		prefrenceAreaProductRelationService.save(prefrenceAreaProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新prefrenceAreaProductRelation")
    @RequestMapping("/update")
    public R update(@RequestBody PrefrenceAreaProductRelationEntity prefrenceAreaProductRelation){
		prefrenceAreaProductRelationService.updateById(prefrenceAreaProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除prefrenceAreaProductRelation")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		prefrenceAreaProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
