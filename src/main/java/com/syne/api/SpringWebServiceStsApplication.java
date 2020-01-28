package com.syne.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure
   .SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringWebServiceStsApplication {

//	@RequestMapping("/test")
//    @ResponseBody
//    String home() {
//      return "SSS!";
//    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebServiceStsApplication.class, args);
	}

}
