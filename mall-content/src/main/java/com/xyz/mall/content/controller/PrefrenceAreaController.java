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

import com.xyz.mall.content.entity.PrefrenceAreaEntity;
import com.xyz.mall.content.service.PrefrenceAreaService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 优选专区
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:52
 */
@Api(tags = "prefrenceAreaController")
@RestController
@RequestMapping("content/prefrencearea")
public class PrefrenceAreaController {
    @Autowired
    private PrefrenceAreaService prefrenceAreaService;

    /**
     * 列表
     */
    @ApiOperation("分页查询prefrenceArea")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = prefrenceAreaService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PrefrenceAreaEntity prefrenceArea = prefrenceAreaService.getById(id);

        return R.ok().put("prefrenceArea", prefrenceArea);
    }

    /**
     * 保存
     */
    @ApiOperation("保存prefrenceArea")
    @RequestMapping("/save")
    public R save(@RequestBody PrefrenceAreaEntity prefrenceArea){
		prefrenceAreaService.save(prefrenceArea);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新prefrenceArea")
    @RequestMapping("/update")
    public R update(@RequestBody PrefrenceAreaEntity prefrenceArea){
		prefrenceAreaService.updateById(prefrenceArea);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除prefrenceArea")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		prefrenceAreaService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
