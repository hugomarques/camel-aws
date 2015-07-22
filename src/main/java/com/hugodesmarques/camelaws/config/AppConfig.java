package com.hugodesmarques.camelaws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

/**
 * Created by hugomarques on 21/7/15.
 */
@Configuration
@ComponentScan(basePackages = "com.hugodesmarques.camelaws",
        excludeFilters = @ComponentScan.Filter(Controller.class))
@PropertySource({"classpath:web.properties", "classpath:camel.properties"})
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
