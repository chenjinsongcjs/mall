package com.xyz.mall.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 优选专区
 *
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:54:52
 */
@Data
@TableName("cms_prefrence_area")
public class PrefrenceAreaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;
    private String name;
    private String subTitle;
    @ApiModelProperty(value = "展示图片")
    private byte[] pic; //数据库的varbinary binary 等对应java 的byte数组
    private Integer sort;
    private Integer showStatus;

}
