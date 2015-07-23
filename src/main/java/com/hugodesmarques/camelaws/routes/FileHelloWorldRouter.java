package com.hugodesmarques.camelaws.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by hugomarques on 22/7/15.
 */
@Component
public class FileHelloWorldRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:data/input?noop=true").log(LoggingLevel.ERROR,"${body}").to("file:data/output");
    }

}
