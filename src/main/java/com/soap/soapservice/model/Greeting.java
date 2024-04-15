package com.soap.soapservice.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Greeting {
    private String message;
}
