package com.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApiApplication {

	@RequestMapping("/")
	String index(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}

}
