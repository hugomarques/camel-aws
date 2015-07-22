package com.hugodesmarques.camelaws.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by hugomarques on 21/7/15.
 */

@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = "com.hugodesmarques.camelaws.controller",
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(Controller.class)
)
public class ServletConfig
{
}