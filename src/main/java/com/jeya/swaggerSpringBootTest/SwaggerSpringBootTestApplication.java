package com.jeya.swaggerSpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerSpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringBootTestApplication.class, args);
	}

}
