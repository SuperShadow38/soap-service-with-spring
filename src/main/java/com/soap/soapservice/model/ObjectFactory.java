package com.soap.soapservice.model;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.soapservice.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Greeting }
     */
    public Greeting createGreeting() {
        return new Greeting();
    }

    /**
     * Create an instance of {@link SayHelloRequest }
     */
    public SayHelloRequest createSayHelloRequest() {
        return new SayHelloRequest();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

}
