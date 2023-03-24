package com.proyectodemo.app.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
public class RestfulApiApplication {
public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}

}
