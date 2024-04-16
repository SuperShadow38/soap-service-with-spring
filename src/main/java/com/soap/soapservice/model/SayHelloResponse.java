package com.soap.soapservice.model;

import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "SayHelloResponse")
public class SayHelloResponse {
    
    @NotNull
    private Greeting greeting;
}
