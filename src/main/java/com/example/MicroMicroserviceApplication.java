package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
public class MicroMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroMicroserviceApplication.class, args);
	}
}

@RestController
class GreetingRestController {

	@RequestMapping (method = RequestMethod.GET, value = "/hello")
	Map<String,String> hello (){
		return Collections.singletonMap("greeting","Hello, world!");
	}
}