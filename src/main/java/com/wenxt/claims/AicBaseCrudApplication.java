package com.wenxt.claims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:common_msgs.properties")


@Configuration
public class AicBaseCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AicBaseCrudApplication.class, args);
	}

}
