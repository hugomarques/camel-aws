package com.hugodesmarques.camelaws.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by hugomarques on 22/7/15.
 */
//@Component
public class FileHelloWorldRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:data/input?noop=true").log(LoggingLevel.INFO,"${body}").to("file:data/output");
    }

}
