package com.demo.rest;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.rest.controller.FileUploadController;

@Configuration
@ComponentScan({"com.demo.rest.controller"})
@EnableAutoConfiguration
public class SpringbootfileuploadApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(SpringbootfileuploadApplication.class, args);
	}

}

