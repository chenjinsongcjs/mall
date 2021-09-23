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

import com.xyz.mall.content.entity.HelpEntity;
import com.xyz.mall.content.service.HelpService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 帮助表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:53
 */
@Api(tags = "helpController")
@RestController
@RequestMapping("content/help")
public class HelpController {
    @Autowired
    private HelpService helpService;

    /**
     * 列表
     */
    @ApiOperation("分页查询help")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = helpService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HelpEntity help = helpService.getById(id);

        return R.ok().put("help", help);
    }

    /**
     * 保存
     */
    @ApiOperation("保存help")
    @RequestMapping("/save")
    public R save(@RequestBody HelpEntity help){
		helpService.save(help);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新help")
    @RequestMapping("/update")
    public R update(@RequestBody HelpEntity help){
		helpService.updateById(help);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除help")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		helpService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
