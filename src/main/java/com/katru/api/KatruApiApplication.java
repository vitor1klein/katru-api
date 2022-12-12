package com.katru.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


// @EntityScan(basePackages = {"com.katru.api.entity"})
// @EnableJpaRepositories("com.katru.api.repository")
@SpringBootApplication
public class KatruApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KatruApiApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
