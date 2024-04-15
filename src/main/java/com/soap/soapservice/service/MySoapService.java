package com.soap.soapservice.service;

import com.soap.soapservice.model.ObjectFactory;

import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.soapservice.model.Greeting;
import com.soap.soapservice.model.SayHelloRequest;
import com.soap.soapservice.model.SayHelloResponse;

@Endpoint
@Component
public class MySoapService {
    
    private static final String NAMESPACE_URI = "http://localhost:8080";

    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SayHelloRequest")
    @ResponsePayload
    public SayHelloResponse sayHello(@RequestPayload SayHelloRequest request) {
        ObjectFactory factory = new ObjectFactory();
        Greeting greeting = factory.createGreeting();
        greeting.setMessage("Hello, " + request.getName() + "!");
        
        SayHelloResponse response = factory.createSayHelloResponse();
        response.setGreeting(greeting);
        
        return response;
        
    }

}
