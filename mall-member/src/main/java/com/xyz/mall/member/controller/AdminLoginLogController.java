package com.xyz.mall.member.controller;

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

import com.xyz.mall.member.entity.AdminLoginLogEntity;
import com.xyz.mall.member.service.AdminLoginLogService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 后台用户登录日志表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:57:15
 */
@Api(tags = "adminLoginLogController")
@RestController
@RequestMapping("member/adminloginlog")
public class AdminLoginLogController {
    @Autowired
    private AdminLoginLogService adminLoginLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询adminLoginLog")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adminLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AdminLoginLogEntity adminLoginLog = adminLoginLogService.getById(id);

        return R.ok().put("adminLoginLog", adminLoginLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存adminLoginLog")
    @RequestMapping("/save")
    public R save(@RequestBody AdminLoginLogEntity adminLoginLog){
		adminLoginLogService.save(adminLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新adminLoginLog")
    @RequestMapping("/update")
    public R update(@RequestBody AdminLoginLogEntity adminLoginLog){
		adminLoginLogService.updateById(adminLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除adminLoginLog")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		adminLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
