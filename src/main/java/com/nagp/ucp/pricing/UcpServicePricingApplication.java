package com.nagp.ucp.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({ "com.nagp.ucp" })
public class UcpServicePricingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcpServicePricingApplication.class, args);
	}
}
