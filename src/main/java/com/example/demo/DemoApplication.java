package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
//扫描注解包地址，可以配置多个
@ComponentScan(basePackages = {"controller","controller*"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("")
	public String hello() {
		return "Hello! Docker!";
	}

	@GetMapping("/hello/{name}")
	@ResponseBody
	public Object hello(@PathVariable("name") String name){

		return "hello " + name;
	}
}