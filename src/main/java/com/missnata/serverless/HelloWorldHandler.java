package com.missnata.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.CloudFrontEvent;

public class HelloWorldHandler implements RequestHandler<CloudFrontEvent.Request, String> {

    @Override
    public String handleRequest(CloudFrontEvent.Request input, Context context) {
        return "Hello World";
    }
}
