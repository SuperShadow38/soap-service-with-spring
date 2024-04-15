package com.soap.soapservice.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "SayHelloRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class SayHelloRequest {
    
    @XmlElement(name = "Name")
    private String name;

}
