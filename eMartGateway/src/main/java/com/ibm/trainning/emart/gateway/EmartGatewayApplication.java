package com.ibm.trainning.emart.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EmartGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartGatewayApplication.class, args);
	}

}
