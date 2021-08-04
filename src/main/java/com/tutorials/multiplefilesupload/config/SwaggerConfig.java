package com.tutorials.multiplefilesupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tutorials"))
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "Multiple Files Upload Service",
                "This is a service that helps you upload and download multipart files in batches",
                "1.0",
                "None for now",
                new Contact("Doctor Vee", "https://github.com/Victor-Chinewubeze", "ovisco360@gmail.com"),
                "LinkedIn Profile",
                "https://www.linkedin.com/in/victor-chinewubeze/",
                Collections.emptyList()
        );
    }
}
