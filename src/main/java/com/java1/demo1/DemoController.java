package com.java1.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
public class DemoController {
	@RequestMapping("/index")
	public String index(){
		return "a1";
	}
	public static void main(String args[]){
		SpringApplication.run(DemoController.class, args);
	}
}
