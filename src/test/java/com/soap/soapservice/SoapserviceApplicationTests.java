package com.soap.soapservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soap.soapservice.service.MySoapService;

@SpringBootTest
class SoapserviceApplicationTests {

	@Autowired
    private MySoapService soapService;

	@Test
	void contextLoads() {
		assertNotNull(soapService);
	}

}
