package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ReddyApplication {
@RequestMapping(value="/")
public String Index() {
	return"<h1>Welcome to spring boot<h1>";
}
	public static void main(String[] args) {
		SpringApplication.run(ReddyApplication.class, args);
	}

}
