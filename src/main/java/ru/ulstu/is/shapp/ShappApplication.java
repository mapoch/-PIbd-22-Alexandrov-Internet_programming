package ru.ulstu.is.shapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@SpringBootApplication
@RestController
public class ShappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShappApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/task")
	public String task(@RequestParam(value = "string", defaultValue = "World") String str) {
		return "\"" + str + "\"" + " - " + str.length();
	}

}
