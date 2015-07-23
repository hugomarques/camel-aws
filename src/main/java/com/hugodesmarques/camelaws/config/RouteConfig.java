package com.hugodesmarques.camelaws.config;

import com.hugodesmarques.camelaws.routes.FileHelloWorldRouter;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hugomarques on 21/7/15.
 */
@Configuration
@ComponentScan(basePackages = "com.hugodesmarques.camelaws.routes")
public class RouteConfig extends CamelConfiguration {

}
