package com.serviexpress.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Configuracion de cors para la aplicacion, con autorizacion de las respuestas hacia el cliente.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Configuration
public class CorsConfig {

    /**
     * Metodo de configuracion de los cors de la aplicacion para aceptar peticiones
     * http dentro de la aplicacion.
     * <p>
     * 1.0 Franco Cortez - Version incial.
     *
     * @return un nuevo adaptador web para filtrar peticiones http
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("PUT", "POST", "DELETE", "GET");
            }
        };
    }
}
