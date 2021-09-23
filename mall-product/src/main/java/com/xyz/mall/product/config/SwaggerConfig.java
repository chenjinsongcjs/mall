package com.xyz.mall.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈进松
 * @Date: 2021/09/24/1:51
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket(Environment environment){
        Profiles dev = Profiles.of("dev");//开发环境开启
        boolean isOpen = environment.acceptsProfiles(dev);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("cjsstart")
                .enable(isOpen)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xyz.mall.product.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        Contact contact = new Contact("cjsstart","http://www.xyz.com","xxx@xyz.com");
        ApiInfo apiInfo = new ApiInfo("商城的在线API文档"
        ,"商城基础项目"
                ,"v1.0"
                ,"http://www.xyz.com"
                ,contact
                ,"Apache License2.0"
                ,"http://www.apache.org/licenses/LICENSE-2.0.html"
                ,new ArrayList<>());
        return apiInfo;
    }
}