package com.xyz.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 人气推荐商品表
 * 
 * @author cjsstart
 * @email 13887096914@163.com
 * @date 2021-09-24 00:55:57
 */
@Data
@TableName("sms_home_recommend_product")
public class HomeRecommendProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
		private Long id;
		private Long productId;
		private String productName;
		private Integer recommendStatus;
		private Integer sort;

}
