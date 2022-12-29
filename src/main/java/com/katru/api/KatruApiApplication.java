package com.katru.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.katru.api.config.RsaKeyProperties;


@EnableConfigurationProperties(RsaKeyProperties.class)
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
