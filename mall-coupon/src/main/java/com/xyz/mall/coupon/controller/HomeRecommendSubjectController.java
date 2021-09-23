package com.xyz.mall.coupon.controller;

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

import com.xyz.mall.coupon.entity.HomeRecommendSubjectEntity;
import com.xyz.mall.coupon.service.HomeRecommendSubjectService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 首页推荐专题表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:57
 */
@Api(tags = "homeRecommendSubjectController")
@RestController
@RequestMapping("coupon/homerecommendsubject")
public class HomeRecommendSubjectController {
    @Autowired
    private HomeRecommendSubjectService homeRecommendSubjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询homeRecommendSubject")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeRecommendSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeRecommendSubjectEntity homeRecommendSubject = homeRecommendSubjectService.getById(id);

        return R.ok().put("homeRecommendSubject", homeRecommendSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存homeRecommendSubject")
    @RequestMapping("/save")
    public R save(@RequestBody HomeRecommendSubjectEntity homeRecommendSubject){
		homeRecommendSubjectService.save(homeRecommendSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新homeRecommendSubject")
    @RequestMapping("/update")
    public R update(@RequestBody HomeRecommendSubjectEntity homeRecommendSubject){
		homeRecommendSubjectService.updateById(homeRecommendSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除homeRecommendSubject")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeRecommendSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
