package com.serviexpress.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
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
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Api rest para portafolio de titulo",
                "Api considerada para enviar datos a angular en el proyecto servicio de taller mecanico",
                "v1.0",
                "Derechos duoc uc",
                new Contact("Franco cortez nuñez, Bastian Salazar, Erika Campos", "www.atlasframework.com", "www.duoc.cl"),
                "Licencia exclusiva para el uso del portafolio", "", Collections.emptyList());
    }
}
