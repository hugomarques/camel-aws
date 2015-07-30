package com.hugodesmarques.camelaws.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws.s3.S3Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by hugomarques on 22/7/15.
 */
@Component
public class InputToS3Router extends RouteBuilder {

    @Value("${AWS_REGION}")
    private String s3Region;

    @Override
    public void configure() throws Exception {
        String s3AcessKey = System.getenv("S3_ACCESS_KEY");
        String s3SecretKey = System.getenv("S3_SECRET_KEY");
        from("file://data/input?noop=true").log(LoggingLevel.INFO, "${body}").setHeader(S3Constants.KEY, simple("file:name"))
        .to("aws-s3://riderautoparts?accessKey=RAW(" + s3AcessKey + ")&secretKey=RAW(" + s3SecretKey + ")&region=" + s3Region);
    }

}
