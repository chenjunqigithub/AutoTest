package com.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 访问地址：http://localhost:8998/swagger-ui.html
 * @author DN
 *
 */
@Configuration
@EnableSwagger2     //开启Swagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
    	return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select().paths(Predicates.not(PathSelectors.regex("/error.*"))).paths(PathSelectors.regex("/.*")).build();
    }

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("我的接口文档").contact(new Contact("juqni", "", "2504335796@qq.com")).
				description("this is UserManager service API").version("1.0.0.0").build();
	}
}
