package com.soap.soapservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "SayHelloRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class SayHelloRequest {
    
    
    @NotNull
    @NotBlank
    @Size(min = 2, max = 50)
    @XmlElement(name = "Name")
    private String name;

}
