//package com.inn.cafe.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//
//@Configuration
//public class SwaggerConfig {
//    @Bean
//    public Docket createApiDocket(){
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(getApiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.inn.cafe.restImpl"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo getApiInfo() {
//        return new ApiInfoBuilder()
//                .title("Cafe Management System Application")
//                .description("description")
//                .version("1.0")
//                .build();
//    }
//}
