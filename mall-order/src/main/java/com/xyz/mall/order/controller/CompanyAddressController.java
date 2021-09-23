package com.xyz.mall.order.controller;

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

import com.xyz.mall.order.entity.CompanyAddressEntity;
import com.xyz.mall.order.service.CompanyAddressService;
import com.xyz.mall.common.utils.PageUtils;
import com.xyz.mall.common.utils.R;



/**
 * 公司收发货地址表
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:53:40
 */
@Api(tags = "companyAddressController")
@RestController
@RequestMapping("order/companyaddress")
public class CompanyAddressController {
    @Autowired
    private CompanyAddressService companyAddressService;

    /**
     * 列表
     */
    @ApiOperation("分页查询companyAddress")
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = companyAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("按照id查询")
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CompanyAddressEntity companyAddress = companyAddressService.getById(id);

        return R.ok().put("companyAddress", companyAddress);
    }

    /**
     * 保存
     */
    @ApiOperation("保存companyAddress")
    @RequestMapping("/save")
    public R save(@RequestBody CompanyAddressEntity companyAddress){
		companyAddressService.save(companyAddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新companyAddress")
    @RequestMapping("/update")
    public R update(@RequestBody CompanyAddressEntity companyAddress){
		companyAddressService.updateById(companyAddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除companyAddress")
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		companyAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
